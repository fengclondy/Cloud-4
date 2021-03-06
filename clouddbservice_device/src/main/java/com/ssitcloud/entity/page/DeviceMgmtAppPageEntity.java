package com.ssitcloud.entity.page;

import java.util.List;

import com.ssitcloud.common.entity.DatagridPageEntity;


/**
 * 
 * @package com.ssitcloud.devmgmt.entity
 * @comment	设备信息分页 馆员app
 * @author shuangjunjie
 */
public class DeviceMgmtAppPageEntity extends DatagridPageEntity<DeviceMgmtAppPageEntity>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer device_idx;
	
	private String device_type;
	
	private String device_type_desc;
	
	private String device_group_name;
	
	private Integer device_group_idx; 
	
	private String device_id;
	
	private String device_name;
	
	private Integer library_idx;
	//数据同步配置模版id
	private String device_dbsync_tpl_idx;
	//是否采用数据同步模版
	private String device_dbsync_tpl_flg;
	//硬件逻辑配置
	private String device_ext_tpl_idx;
	//是否采用硬件模版
	private String device_ext_tpl_flg;
	//监控配置
	private String device_monitor_tpl_idx;
	//是否采用监控模版
	private String device_monitor_tpl_flg;
	//运行配置
	private String device_run_tpl_idx;
	//是否采用运行配置模版
	private String device_run_tpl_flg;
	
	//查询参数	父馆和子馆对应的idx
	private List<Integer> libIdxs;
	
	//查询参数	区域idx
	private Integer region_idx;
	
	
	public Integer getDevice_group_idx() {
		return device_group_idx;
	}
	public void setDevice_group_idx(Integer device_group_idx) {
		this.device_group_idx = device_group_idx;
	}
	public Integer getDevice_idx() {
		return device_idx;
	}
	public void setDevice_idx(Integer device_idx) {
		this.device_idx = device_idx;
	}
	public String getDevice_type() {
		return device_type;
	}
	public void setDevice_type(String device_type) {
		this.device_type = device_type;
	}
	public String getDevice_group_name() {
		return device_group_name;
	}
	public void setDevice_group_name(String device_group_name) {
		this.device_group_name = device_group_name;
	}
	public String getDevice_id() {
		return device_id;
	}
	public void setDevice_id(String device_id) {
		this.device_id = device_id;
	}
	public String getDevice_name() {
		return device_name;
	}
	public void setDevice_name(String device_name) {
		this.device_name = device_name;
	}
	public Integer getLibrary_idx() {
		return library_idx;
	}
	public void setLibrary_idx(Integer library_idx) {
		this.library_idx = library_idx;
	}
	public String getDevice_dbsync_tpl_idx() {
		return device_dbsync_tpl_idx;
	}
	public void setDevice_dbsync_tpl_idx(String device_dbsync_tpl_idx) {
		this.device_dbsync_tpl_idx = device_dbsync_tpl_idx;
	}
	public String getDevice_dbsync_tpl_flg() {
		return device_dbsync_tpl_flg;
	}
	public void setDevice_dbsync_tpl_flg(String device_dbsync_tpl_flg) {
		this.device_dbsync_tpl_flg = device_dbsync_tpl_flg;
	}
	public String getDevice_ext_tpl_idx() {
		return device_ext_tpl_idx;
	}
	public void setDevice_ext_tpl_idx(String device_ext_tpl_idx) {
		this.device_ext_tpl_idx = device_ext_tpl_idx;
	}
	public String getDevice_ext_tpl_flg() {
		return device_ext_tpl_flg;
	}
	public void setDevice_ext_tpl_flg(String device_ext_tpl_flg) {
		this.device_ext_tpl_flg = device_ext_tpl_flg;
	}
	public String getDevice_monitor_tpl_idx() {
		return device_monitor_tpl_idx;
	}
	public void setDevice_monitor_tpl_idx(String device_monitor_tpl_idx) {
		this.device_monitor_tpl_idx = device_monitor_tpl_idx;
	}
	public String getDevice_monitor_tpl_flg() {
		return device_monitor_tpl_flg;
	}
	public void setDevice_monitor_tpl_flg(String device_monitor_tpl_flg) {
		this.device_monitor_tpl_flg = device_monitor_tpl_flg;
	}
	public String getDevice_run_tpl_idx() {
		return device_run_tpl_idx;
	}
	public void setDevice_run_tpl_idx(String device_run_tpl_idx) {
		this.device_run_tpl_idx = device_run_tpl_idx;
	}
	public String getDevice_run_tpl_flg() {
		return device_run_tpl_flg;
	}
	public void setDevice_run_tpl_flg(String device_run_tpl_flg) {
		this.device_run_tpl_flg = device_run_tpl_flg;
	}
	public String getDevice_type_desc() {
		return device_type_desc;
	}
	public void setDevice_type_desc(String device_type_desc) {
		this.device_type_desc = device_type_desc;
	}
	public List<Integer> getLibIdxs() {
		return libIdxs;
	}
	public void setLibIdxs(List<Integer> libIdxs) {
		this.libIdxs = libIdxs;
	}
	public Integer getRegion_idx() {
		return region_idx;
	}
	public void setRegion_idx(Integer region_idx) {
		this.region_idx = region_idx;
	}
	
	
	
	
}
