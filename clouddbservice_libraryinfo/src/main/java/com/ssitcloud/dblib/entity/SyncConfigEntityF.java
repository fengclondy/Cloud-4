package com.ssitcloud.dblib.entity;


public class SyncConfigEntityF {
	private String db_name;
	private String table_name;
	private Integer issync;
	private String sync_cycle;
	private String sync_field_list;
	private String sync_type;
	private String sync_state;
	public String getDb_name() {
		return db_name;
	}
	public void setDb_name(String db_name) {
		this.db_name = db_name;
	}
	public String getTable_name() {
		return table_name;
	}
	public void setTable_name(String table_name) {
		this.table_name = table_name;
	}
	public Integer getIssync() {
		return issync;
	}
	public void setIssync(Integer issync) {
		this.issync = issync;
	}
	public String getSync_cycle() {
		return sync_cycle;
	}
	public void setSync_cycle(String sync_cycle) {
		this.sync_cycle = sync_cycle;
	}
	public String getSync_field_list() {
		return sync_field_list;
	}
	public void setSync_field_list(String sync_field_list) {
		this.sync_field_list = sync_field_list;
	}
	public String getSync_type() {
		return sync_type;
	}
	public void setSync_type(String sync_type) {
		this.sync_type = sync_type;
	}
	public String getSync_state() {
		return sync_state;
	}
	public void setSync_state(String sync_state) {
		this.sync_state = sync_state;
	}
	
	
}
