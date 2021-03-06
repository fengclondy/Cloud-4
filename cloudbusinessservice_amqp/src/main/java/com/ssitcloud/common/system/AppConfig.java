package com.ssitcloud.common.system;

import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.ssitcloud.businessauth.utils.XMLUtils;
import com.ssitcloud.common.entity.RequestURLListEntity;

@Configuration
public class AppConfig {
	/**
	 *<p> 随着spring启动，将RequestURL.xml中的Url信息装入RequestURLListEntity中</p>
	 * 
	 * 使用方法
	 * <br/>@Resource(name="requestURL")<br/>
	 * RequestURLListEntity requestURLListEntity;<br/><br/>
	 * 获取requestURLListEntity对象，再通过ID属性获取对应的requestURL<br/>
	 * 
	 * @methodName: requestURL
	 * @return
	 * @throws Exception
	 * @returnType: RequestURLListEntity
	 * @author: liuBh
	 */
	@Bean(name = "requestURL")
	public RequestURLListEntity requestURL() throws Exception {
		Resource resource = new ClassPathResource("config/RequestURL.xml"); 
		Map<String, String> map = XMLUtils.parseAll(resource.getInputStream());
		return new RequestURLListEntity(map);
	}
	
	
	
}
