package com.ssitcloud.dbstatistics.entity;

/**
 * 财经查询按周统计实体
 * author huanghuang
 * 2017年2月13日 上午10:30:48
 */
public class FineWeekDataEntity{
	/**
	 * 
	 */
	private Integer fine_idx;//int(11) NOT NULL 数据idx
	private Integer lib_idx;//int(11) NOT NULL 图书馆ID
	private Integer device_idx;//设备ID
	private String fineCountType;//varchar(3) NULL 统计类型
	private String finesubType;//varchar(10) NULL 统计子类
	private Integer fineWeekCount;//int(11) NULL 周统计结果
	private String fineDate;//varchar(8) NULL 统计日期
	private String createDate;//varchar(8) NULL 创建日期
	private String updateDate;//varchar(8) NULL 修改日期
	public Integer getFine_idx() {
		return fine_idx;
	}
	public void setFine_idx(Integer fine_idx) {
		this.fine_idx = fine_idx;
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
	public String getFineCountType() {
		return fineCountType;
	}
	public void setFineCountType(String fineCountType) {
		this.fineCountType = fineCountType;
	}
	public String getFinesubType() {
		return finesubType;
	}
	public void setFinesubType(String finesubType) {
		this.finesubType = finesubType;
	}
	public Integer getFineWeekCount() {
		return fineWeekCount;
	}
	public void setFineWeekCount(Integer fineWeekCount) {
		this.fineWeekCount = fineWeekCount;
	}
	public String getFineDate() {
		return fineDate;
	}
	public void setFineDate(String fineDate) {
		this.fineDate = fineDate;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	
	
	
}
