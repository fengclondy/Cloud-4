package com.ssitcloud.shelfmgmt.service;

import com.ssitcloud.common.entity.ResultEntity;


public interface BookitemService {

	public abstract ResultEntity importBookitem(String req);
	
	public abstract ResultEntity importBookitemLocation(String req);
	
	public abstract ResultEntity queryBookitemByCode(String req);
	
	public abstract ResultEntity opacQueryBookitem(String req);
}
