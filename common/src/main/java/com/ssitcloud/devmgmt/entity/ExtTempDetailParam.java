package com.ssitcloud.devmgmt.entity;

/**
 * <p>2016年4月26日 下午7:21:08
 * @author hjc
 */
public class ExtTempDetailParam {
	
	//device_ext_template表的字段
	/** 模板自增idx */
	public String device_tpl_idx;
	/** 模板ID */
	public String device_tpl_ID;
	/** 模板描述 */
	public String device_tpl_desc;
	/** 设备类型IDX */
	public String device_type;
		
	
	//device_ext_config表的字段
	/** 图书馆idx */
	public String library_idx;
	/** 模板区分 0模板 1数据 */
	public String device_tpl_type;
	/** 设备idx或者模板id */
	public String device_ext_id;
	/** 外设通信方式 */
	public String ext_comm_conf;
	/** 外设其它信息 */
	public String ext_extend_conf;
	/** 外设类型 */
	public String logic_obj_idx;
	/** 外设型号 */
	public String ext_model_idx;
	/** device_ext_config更新时间 */
	public String updatetime;
	
	
	//metadata_ext_model表的字段
	/** ext_model模板自增idx */
	public String meta_ext_idx;
	/** 外设型号 */
	public String ext_model;
	/** 外设型号描述 */
	public String ext_model_desc;
	/** 外设版本 */
	public String ext_model_version;
	/** 外设类型 */
	public String ext_type;

	//metadata_logic_obj表字段
	/** logic_obj自增idx */
	public String meta_log_obj_idx;
	/** 逻辑部件ID */
	public String logic_obj;
	/** 逻辑部件描述 */
	public String logic_obj_desc;
	
	
	public String getLibrary_idx() {
		return library_idx;
	}
	public void setLibrary_idx(String library_idx) {
		this.library_idx = library_idx;
	}
	public String getDevice_tpl_type() {
		return device_tpl_type;
	}
	public void setDevice_tpl_type(String device_tpl_type) {
		this.device_tpl_type = device_tpl_type;
	}
	public String getDevice_ext_id() {
		return device_ext_id;
	}
	public void setDevice_ext_id(String device_ext_id) {
		this.device_ext_id = device_ext_id;
	}
	public String getExt_comm_conf() {
		return ext_comm_conf;
	}
	public void setExt_comm_conf(String ext_comm_conf) {
		this.ext_comm_conf = ext_comm_conf;
	}
	public String getExt_extend_conf() {
		return ext_extend_conf;
	}
	public void setExt_extend_conf(String ext_extend_conf) {
		this.ext_extend_conf = ext_extend_conf;
	}
	public String getLogic_obj_idx() {
		return logic_obj_idx;
	}
	public void setLogic_obj_idx(String logic_obj_idx) {
		this.logic_obj_idx = logic_obj_idx;
	}
	public String getExt_model_idx() {
		return ext_model_idx;
	}
	public void setExt_model_idx(String ext_model_idx) {
		this.ext_model_idx = ext_model_idx;
	}
	public String getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(String updatetime) {
		this.updatetime = updatetime;
	}
	public String getDevice_tpl_idx() {
		return device_tpl_idx;
	}
	public void setDevice_tpl_idx(String device_tpl_idx) {
		this.device_tpl_idx = device_tpl_idx;
	}
	public String getDevice_tpl_ID() {
		return device_tpl_ID;
	}
	public void setDevice_tpl_ID(String device_tpl_ID) {
		this.device_tpl_ID = device_tpl_ID;
	}
	public String getDevice_tpl_desc() {
		return device_tpl_desc;
	}
	public void setDevice_tpl_desc(String device_tpl_desc) {
		this.device_tpl_desc = device_tpl_desc;
	}
	public String getDevice_type() {
		return device_type;
	}
	public void setDevice_type(String device_type) {
		this.device_type = device_type;
	}
	public String getMeta_ext_idx() {
		return meta_ext_idx;
	}
	public void setMeta_ext_idx(String meta_ext_idx) {
		this.meta_ext_idx = meta_ext_idx;
	}
	public String getExt_model() {
		return ext_model;
	}
	public void setExt_model(String ext_model) {
		this.ext_model = ext_model;
	}
	public String getExt_model_desc() {
		return ext_model_desc;
	}
	public void setExt_model_desc(String ext_model_desc) {
		this.ext_model_desc = ext_model_desc;
	}
	public String getExt_model_version() {
		return ext_model_version;
	}
	public void setExt_model_version(String ext_model_version) {
		this.ext_model_version = ext_model_version;
	}
	public String getExt_type() {
		return ext_type;
	}
	public void setExt_type(String ext_type) {
		this.ext_type = ext_type;
	}
	public String getMeta_log_obj_idx() {
		return meta_log_obj_idx;
	}
	public void setMeta_log_obj_idx(String meta_log_obj_idx) {
		this.meta_log_obj_idx = meta_log_obj_idx;
	}
	public String getLogic_obj() {
		return logic_obj;
	}
	public void setLogic_obj(String logic_obj) {
		this.logic_obj = logic_obj;
	}
	public String getLogic_obj_desc() {
		return logic_obj_desc;
	}
	public void setLogic_obj_desc(String logic_obj_desc) {
		this.logic_obj_desc = logic_obj_desc;
	}
	
	
	
}
