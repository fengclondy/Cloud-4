package com.ssitcloud.businessauth.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.Consts;
import org.springframework.stereotype.Service;

import com.ssitcloud.businessauth.common.service.impl.BasicServiceImpl;
import com.ssitcloud.businessauth.service.SystemLogService;
import com.ssitcloud.businessauth.utils.HttpClientUtil;
import com.ssitcloud.common.entity.ResultEntity;


/**
 * 系统日志Service
 * @comment 
 * @date 2016年5月31日
 * @author hwl
 */
@Service
public class SystemLogServiceImpl extends BasicServiceImpl implements SystemLogService {

	public static final String URL_GETSYSTEMLOG = "SelectSystemLog"; 
	public static final String URL_GETOPERATORINFO = "SelectOperatorInfo"; 
	private static final String ADD_OPERATIONLOG = "AddOperationLog";
	private static final String URL_getOperationLogType = "getOperationLogType";
	
	@Override
	public String GetSystemloginfo(String json) {
		String reqURL= requestURL.getRequestURL(URL_GETSYSTEMLOG);
		Map<String, String > map = new HashMap<>();
		map.put("json", json);
		String result = HttpClientUtil.doPost(reqURL, map, Consts.UTF_8.toString());
		return result ;
	}

	@Override
	public String GetOperatorList(String json) {
		String reqURL= requestURL.getRequestURL(URL_GETOPERATORINFO);
		Map<String, String > map = new HashMap<>();
		map.put("json", json);
		String result = HttpClientUtil.doPost(reqURL, map, Consts.UTF_8.toString());
		return result ;
	}

	@Override
	public String addOperationLog(String json) {
		String reqURL=requestURL.getRequestURL(ADD_OPERATIONLOG);
		Map<String,String> map=new HashMap<>();
		map.put("json", json);
		String result=HttpClientUtil.doPost(reqURL, map, Consts.UTF_8.toString());
		return result;
	}

	@Override
	public ResultEntity getOperationLogType(String req) {
		return postURL(URL_getOperationLogType, req);
	}
	
}
