package com.ssitcloud.devmgmt.entity;


public class ConfigEntity {
	private Integer id;
	private String label;
	private String name;
	private String fieldset;
	private String deviceType;
	private OptionEntity options;
	private String defaultValue;
	private String fieldset_label;
	private String validator;
	private String guide;
	
	private Integer library_idx;
	public String getFieldset_label() {
		return fieldset_label;
	}
	public void setFieldset_label(String fieldset_label) {
		this.fieldset_label = fieldset_label;
	}
	public String getDefaultValue() {
		return defaultValue;
	}
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFieldset() {
		return fieldset;
	}
	public void setFieldset(String fieldset) {
		this.fieldset = fieldset;
	}
	public String getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	
	public OptionEntity getOptions() {
		return options;
	}
	public void setOptions(OptionEntity options) {
		this.options = options;
	}
	public String getValidator() {
		return validator;
	}
	public void setValidator(String validator) {
		this.validator = validator;
	}
	public String getGuide() {
		return guide;
	}
	public void setGuide(String guide) {
		this.guide = guide;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getLibrary_idx() {
		return library_idx;
	}
	public void setLibrary_idx(Integer library_idx) {
		this.library_idx = library_idx;
	}

	
	
}
