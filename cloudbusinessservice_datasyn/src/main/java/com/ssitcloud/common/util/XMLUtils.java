package com.ssitcloud.common.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.ssitcloud.common.constant.AppConfigConstant;
import com.ssitcloud.common.exception.CommonException;
import com.ssitcloud.common.service.AppConfigService;
import com.ssitcloud.common.service.impl.AppConfigServiceImpl;
import com.ssitcloud.datasync.entity.UpgradeStrategyEntity;

/**
 * XML工具类
 * 
 * @package: com.ssitcloud.common.util
 * @classFile: XMLUtils
 * @author: liuBh
 * @description: TODO
 */
public class XMLUtils {

	public final static String BASE_URL_ATTRIBUTE = "baseURL";
	public final static String REQ_MAPPING_ATTRIBUTE = "requestMapping";
	public final static String PROJECT_NAME_ATTRIBUTE = "projectName";
	public final static String ID_ATTRIBUTE = "id";

	public static String versionXml = "escalation_strategy.xml";
	static {
		try {
			Properties prop = PropertiesLoaderUtils
					.loadProperties(new EncodedResource(new ClassPathResource(
							"config/static-config.properties")));
			versionXml = prop.get("versionXml").toString();
		} catch (IOException e) {
			LogUtils.error("config/static-config.properties FTP 配置异常！！！", e);
		}
	}

	/**
	 * 獲取節點的某個屬性
	 * 
	 * @methodName: getRequestUrlAttribute
	 * @param is
	 * @param id
	 * @param attrName
	 * @returnType: String
	 * @author: liuBh
	 */
	public static String getRequestUrlAttribute(InputStream is, String id,
			String attrName) {
		XPath xpath = XPathFactory.newInstance().newXPath();
		try {
			DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance()
					.newDocumentBuilder();
			Document doc = docBuilder.parse(is);
			Element element = (Element) xpath.evaluate("//RequestUrl[@id='"
					+ id + "']", doc, XPathConstants.NODE);
			return element.getAttribute(attrName);
		} catch (Exception e) {
			throw new CommonException(e);
		}
	}

	/**
	 * 将RequestURL.xml 中全部<RequestURL>元素，
	 * 全部转化成URL，然后以该requestURL的id作为key，存储在map集合中。 并且返回map集合
	 * 
	 * @methodName: parseAll
	 * @param is
	 * @return
	 * @returnType: Map<String,String>
	 * @author: liuBh
	 */
	public static Map<String, String> parseAll(InputStream is) {
		AppConfigService appConfigService = new AppConfigServiceImpl();
		Map<String, String> reqUrls = new HashMap<>();
		String developer_model = PropertiesUtil
				.getConfigPropValueAsText("developer_model");
		String baseUrl = "";
		String nodeName = appConfigService.getAppName();
		String node_interface = AppConfigConstant.NODE_INFACCE_URL;
		if ("true".equals(developer_model)) {
			reqUrls = loadAppConfigForDev(is);
		} else {
			baseUrl = PropertiesUtil
					.getConfigPropValueAsText("cloudbusinessservice_node_url");
			reqUrls = appConfigService.autoReloadAppConfig(nodeName, baseUrl
					+ node_interface);
		}
		return reqUrls;
	}

	/**
	 * 修改RequestURL.xml某个节点元素的属性
	 * 
	 * @methodName: alterRequestURLXML
	 * @param id
	 *            ID属性
	 * @param baseUrl
	 *            baseUrl属性
	 * @param reqMapping
	 *            requestMapping属性
	 * @returnType: void
	 * @author: liuBh
	 */
	public static void AlterRequestURLXML(InputStream is, File file, String id,
			String baseUrl, String reqMapping) {
		try {
			// 创建输入流

			DocumentBuilder db = DocumentBuilderFactory.newInstance()
					.newDocumentBuilder();// 创建DocBuilder对象
			Document doc = db.parse(is);// 获取document对象
			XPath xpath = XPathFactory.newInstance().newXPath();// 创建Xpath对象
			// 创建transFormer对象
			Transformer tran = TransformerFactory.newInstance()
					.newTransformer();
			tran.setOutputProperty(OutputKeys.ENCODING, "utf-8");// 设置编码
			tran.setOutputProperty(OutputKeys.INDENT, "yes");// 支付插入
			tran.setOutputProperty(OutputKeys.VERSION, "1.0");// 版本
			NodeList nodes = (NodeList) xpath.evaluate("//RequestUrl[@id='"
					+ id + "']", doc, XPathConstants.NODESET); // 获取指定的节点集合
			Element e = (Element) nodes.item(0);// 获取第一个
			if (baseUrl != null && !"".equals(baseUrl)) {
				e.setAttribute(BASE_URL_ATTRIBUTE, baseUrl);
			}
			if (reqMapping != null && !"".equals(reqMapping)) {
				e.setAttribute(REQ_MAPPING_ATTRIBUTE, reqMapping);
			}
			Result result = new StreamResult(file);
			tran.transform(new DOMSource(doc), result);
		} catch (Exception e) {
			throw new CommonException(e);
		}

	}

	/**
	 * 新增一個<\RequestURL>節點
	 * 
	 * @methodName: AddNewNodeToRequestURLXML
	 * @param id
	 * @param baseUrl
	 * @param reqMapping
	 * @return
	 * @returnType: int
	 * @author: liuBh
	 */
	public static int AddNewNodeToRequestURLXML(InputStream is, File file,
			String id, String baseUrl, String reqMapping) {
		try {

			DocumentBuilder db = DocumentBuilderFactory.newInstance()
					.newDocumentBuilder();// 创建DocBuilder对象
			Document doc = db.parse(is);// 获取document对象
			XPath xpath = XPathFactory.newInstance().newXPath();// 创建Xpath对象

			Element element = getXMLElement(xpath, id, doc);

			if (element != null) {
				System.err.println("id=" + id + " 已存在");
				return 0;
			}

			// 创建transFormer对象
			Transformer tran = TransformerFactory.newInstance()
					.newTransformer();
			tran.setOutputProperty(OutputKeys.ENCODING, "utf-8");// 设置编码
			tran.setOutputProperty(OutputKeys.INDENT, "yes");// 支付插入
			tran.setOutputProperty(OutputKeys.VERSION, "1.0");// 版本
			Node root = doc.getDocumentElement();
			Element ele = doc.createElement("RequestUrl");
			ele.setAttribute("id", id);
			ele.setAttribute("baseUrl", baseUrl);
			ele.setAttribute("requestMapping", reqMapping);
			root.appendChild(ele);
			Result result = new StreamResult(file);
			tran.transform(new DOMSource(doc), result);
			return 1;
		} catch (Exception e) {
			throw new CommonException(e);
		}
	}

	/**
	 * 通過ID屬性刪除RequestURL.xml中的一個節點
	 * 
	 * @methodName: deleteNodeFromRequestURLXML
	 * @param id
	 * @return
	 * @returnType: int
	 * @author: liuBh
	 */
	public static Node deleteNodeFromRequestURLXML(InputStream is, File file,
			String id) {
		try {
			// 创建输入流

			DocumentBuilder db = DocumentBuilderFactory.newInstance()
					.newDocumentBuilder();// 创建DocBuilder对象
			Document doc = db.parse(is);// 获取document对象
			XPath xpath = XPathFactory.newInstance().newXPath();// 创建Xpath对象
			Element element = getXMLElement(xpath, id, doc);
			if (element != null) {
				// 创建transFormer对象
				Transformer tran = TransformerFactory.newInstance()
						.newTransformer();
				tran.setOutputProperty(OutputKeys.ENCODING, "utf-8");// 设置编码
				tran.setOutputProperty(OutputKeys.INDENT, "yes");// 支付插入
				tran.setOutputProperty(OutputKeys.VERSION, "1.0");// 版本
				Node root = doc.getDocumentElement();
				Node removeNode = root.removeChild(element);
				Result result = new StreamResult(file);
				tran.transform(new DOMSource(doc), result);
				return removeNode;
			}
		} catch (Exception e) {
			throw new CommonException(e);
		}
		return null;
	}

	/**
	 * 获取对应ID属性的 element对象
	 * 
	 * @methodName: getXMLElement
	 * @param xpath
	 * @param id
	 * @param doc
	 * @return
	 * @returnType: Element
	 * @author: liuBh
	 */
	private static Element getXMLElement(XPath xpath, String id, Document doc) {
		try {
			return (Element) xpath.evaluate("//RequestUrl[@id='" + id + "']",
					doc, XPathConstants.NODE);
		} catch (XPathExpressionException e) {
			throw new CommonException(e);
		}
	}

	public static void main(String[] args) throws IOException,
			ParserConfigurationException, XPathExpressionException,
			SAXException {
		// String
		// s=getRequestUrlAttribute(Resources.getResourceAsStream("RequestURL.xml"),
		// "AddNewDeviceConfig", "id");
		// parseVersionXMl();

	}

	/**
	 * 读取升级策略信息 (需要从远程下载)
	 * 
	 * @methodName: parseVersionXMl
	 * @return
	 * @returnType: UpgradeStrategyEntity
	 * @author: liuBh
	 */
	public static UpgradeStrategyEntity parseVersionXMl(String old_version) {
		XmlMapper xmlMapper = new XmlMapper();
		try {
			String path = FtpUtils.downVersionXmlFromFtp(old_version);
			if (path != null) {
				File f = new File(path);
				UpgradeStrategyEntity use = xmlMapper.readValue(f,
						UpgradeStrategyEntity.class);
				return use;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 开发库加载应用节点接口配置
	 * 
	 * @param xpath
	 * @param is
	 * @return
	 */
	private static Map<String, String> loadAppConfigForDev(InputStream is) {

		Map<String, String> reqUrls = new HashMap<>();
		XPath xpath = XPathFactory.newInstance().newXPath();
		try {
			DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance()
					.newDocumentBuilder();
			Document doc = docBuilder.parse(is);
			NodeList projectList = (NodeList) xpath.evaluate("//project", doc,
					XPathConstants.NODESET);
			for (int i = 0; i < projectList.getLength(); i++) {
				Element project = (Element) projectList.item(i);
				// String baseUrl = project.getAttribute(BASE_URL_ATTRIBUTE);
				String baseUrl = null;
				String projectName = project
						.getAttribute(PROJECT_NAME_ATTRIBUTE);
				baseUrl = PropertiesUtil.getConfigPropValueAsText(projectName
						+ "_url_developer");
				if (baseUrl == null) {
					String msg = projectName + "_url_developer";
					throw new CommonException(
							"baseUrl出现异常，请检查config.properties是否存->" + msg);
				}
				NodeList requestUrlList = project.getChildNodes();
				for (int j = 0; j < requestUrlList.getLength(); j++) {
					Node reqUrl = requestUrlList.item(j);
					if (reqUrl instanceof Element) {
						Element eleReqUrl = (Element) reqUrl;
						String id = eleReqUrl.getAttribute(ID_ATTRIBUTE);
						String reqMapping = eleReqUrl
								.getAttribute(REQ_MAPPING_ATTRIBUTE);
						// url
						// 例如：http://127.0.0.1:8080/clouddbservice_device/devconf/AddNewDeviceConfig
						String url = baseUrl + reqMapping;
						if (reqUrls.containsKey(id)) {
							throw new CommonException(
									"請檢查 RequestURL.xml文件 : ID屬性 [" + id
											+ "]是否重複");
						}
						LogUtils.info("装载URL：" + id + "-->" + url);
						reqUrls.put(id, url);
					}
				}
			}
			return reqUrls;
		} catch (Exception e) {
			throw new CommonException(e);
		}

	}

}
