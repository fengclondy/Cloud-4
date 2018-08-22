package com.ssitcloud.devmgmt.entity;

/**
 * 设备风格显示配置
 * @author dell
 *
 */
public class DeviceDisplayConfig {
	private int display_type_idx;
	private int device_type_idx;
	private String display_type_id;
	private String display_type_name;
	private String display_type_url;
	private String display_type_desc;
	private Integer version_stamp;

	public int getDisplay_type_idx() {
		return display_type_idx;
	}

	public void setDisplay_type_idx(int display_type_idx) {
		this.display_type_idx = display_type_idx;
	}

	public int getDevice_type_idx() {
		return device_type_idx;
	}

	public void setDevice_type_idx(int device_type_idx) {
		this.device_type_idx = device_type_idx;
	}

	public String getDisplay_type_id() {
		return display_type_id;
	}

	public void setDisplay_type_id(String display_type_id) {
		this.display_type_id = display_type_id;
	}

	public String getDisplay_type_name() {
		return display_type_name;
	}

	public void setDisplay_type_name(String display_type_name) {
		this.display_type_name = display_type_name;
	}

	public String getDisplay_type_url() {
		return display_type_url;
	}

	public void setDisplay_type_url(String display_type_url) {
		this.display_type_url = display_type_url;
	}

	public String getDisplay_type_desc() {
		return display_type_desc;
	}

	public void setDisplay_type_desc(String display_type_desc) {
		this.display_type_desc = display_type_desc;
	}
	
	public Integer getVersion_stamp() {
		return version_stamp;
	}

	public void setVersion_stamp(Integer version_stamp) {
		this.version_stamp = version_stamp;
	}

	@Override
	public String toString() {
		return "DeviceDisplayConfig [display_type_idx=" + display_type_idx + ", device_type_idx=" + device_type_idx + ", display_type_id=" + display_type_id + ", display_type_name="
				+ display_type_name + ", display_type_url=" + display_type_url + ", display_type_desc=" + display_type_desc + ", version_stamp=" + version_stamp + "]";
	}

}
