package com.ssitcloud.shelfmgmt.service;

import com.ssitcloud.common.entity.ResultEntity;


public interface MakeshelfService {

	ResultEntity queryAllMakeShelfRecord(String req);
	
	ResultEntity deleteBookshelflayer(String req);
	
	ResultEntity makeshelf(String req);
	
	ResultEntity deleteMakeShelfRecord(String req);
}