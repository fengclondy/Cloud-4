package com.ssitcloud.entity;

import java.sql.Timestamp;

/**
 * 故障通知实体
 * author huanghuang
 * 2017年3月13日 下午1:52:24
 */
public class DeviceTroubleEntity {
	private Integer trouble_idx;
	private Integer lib_idx;
	private Integer device_idx;
	private String trouble_info;
	private String trouble_name;
	private Timestamp create_time;
	private Timestamp control_time;
	
	public Integer getTrouble_idx() {
		return trouble_idx;
	}
	public void setTrouble_idx(Integer trouble_idx) {
		this.trouble_idx = trouble_idx;
	}
	public Integer getLib_idx() {
		return lib_idx;
	}
	public void setLib_idx(Integer lib_idx) {
		this.lib_idx = lib_idx;
	}
	public Integer getDevice_idx() {
		return device_idx;
	}
	public void setDevice_idx(Integer device_idx) {
		this.device_idx = device_idx;
	}
	public String getTrouble_info() {
		return trouble_info;
	}
	public void setTrouble_info(String trouble_info) {
		this.trouble_info = trouble_info;
	}
	public String getTrouble_name() {
		return trouble_name;
	}
	public void setTrouble_name(String trouble_name) {
		this.trouble_name = trouble_name;
	}
	public Timestamp getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Timestamp create_time) {
		this.create_time = create_time;
	}
	public Timestamp getControl_time() {
		return control_time;
	}
	public void setControl_time(Timestamp control_time) {
		this.control_time = control_time;
	}
	
	
} 
