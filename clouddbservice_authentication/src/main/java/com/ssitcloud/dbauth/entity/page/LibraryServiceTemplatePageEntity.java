package com.ssitcloud.dbauth.entity.page;

import com.ssitcloud.common.entity.DatagridPageEntity;

public class LibraryServiceTemplatePageEntity extends DatagridPageEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 模板ID */
	private Integer lib_service_tpl_id;
	/** 模板描述 */
	private String lib_service_tpl_desc;
	/** 服务周期，单位：月 */
	private Integer service_cycle;
	/** 最大设备数 */
	private Integer max_device_count;
	/** 最大用户数 */
	private Integer max_operator_count;
	/** 图书馆规模数 */
	private Integer max_sublib_count;
	private Integer version_stamp;
	public Integer getLib_service_tpl_id() {
		return lib_service_tpl_id;
	}
	public void setLib_service_tpl_id(Integer lib_service_tpl_id) {
		this.lib_service_tpl_id = lib_service_tpl_id;
	}
	public String getLib_service_tpl_desc() {
		return lib_service_tpl_desc;
	}
	public void setLib_service_tpl_desc(String lib_service_tpl_desc) {
		this.lib_service_tpl_desc = lib_service_tpl_desc;
	}
	public Integer getService_cycle() {
		return service_cycle;
	}
	public void setService_cycle(Integer service_cycle) {
		this.service_cycle = service_cycle;
	}
	public Integer getMax_device_count() {
		return max_device_count;
	}
	public void setMax_device_count(Integer max_device_count) {
		this.max_device_count = max_device_count;
	}
	public Integer getMax_operator_count() {
		return max_operator_count;
	}
	public void setMax_operator_count(Integer max_operator_count) {
		this.max_operator_count = max_operator_count;
	}
	public Integer getMax_sublib_count() {
		return max_sublib_count;
	}
	public void setMax_sublib_count(Integer max_sublib_count) {
		this.max_sublib_count = max_sublib_count;
	}
	public Integer getVersion_stamp() {
		return version_stamp;
	}
	public void setVersion_stamp(Integer version_stamp) {
		this.version_stamp = version_stamp;
	}
	
	
}
