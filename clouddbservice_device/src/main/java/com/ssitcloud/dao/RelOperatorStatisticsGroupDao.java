package com.ssitcloud.dao;

import java.util.List;

import com.ssitcloud.entity.RelOperatorStatisticsGroupEntity;

/**
 * 操作员组与模板组关联表
 *
 * <p>2017年2月10日 下午2:18:52  
 * @author hjc 
 *
 */
public interface RelOperatorStatisticsGroupDao {

	/**
	 * 操作员组与模板组关联RelOperatorStatisticsGroupEntity插入
	 * author huanghuang
	 * 2017年2月9日 下午1:30:27
	 * @param relOperatorStatisticsGroupEntity
	 * @return
	 */
	public abstract int insertRelOperatorStatisticsGroup(RelOperatorStatisticsGroupEntity relOperatorStatisticsGroupEntity);
	
	/**
	 * 操作员组与模板组关联RelOperatorStatisticsGroupEntity修改
	 * author huanghuang
	 * 2017年2月9日 下午1:30:55
	 * @param relOperatorStatisticsGroupEntity
	 * @return
	 */
	public abstract int updateRelOperatorStatisticsGroup(RelOperatorStatisticsGroupEntity relOperatorStatisticsGroupEntity);
	
	/**
	 * 操作员组与模板组关联RelOperatorStatisticsGroupEntity删除
	 * author huanghuang
	 * 2017年2月9日 下午1:31:18
	 * @param relOperatorStatisticsGroupEntity
	 * @return
	 */
	public abstract int deleteRelOperatorStatisticsGroup(RelOperatorStatisticsGroupEntity relOperatorStatisticsGroupEntity);
	
	/**
	 * 操作员组与模板组关联RelOperatorStatisticsGroupEntity单个查询
	 * author huanghuang
	 * 2017年2月9日 下午1:31:47
	 * @param relOperatorStatisticsGroupEntity
	 * @return
	 */
	public abstract RelOperatorStatisticsGroupEntity queryOneRelOperatorStatisticsGroup(RelOperatorStatisticsGroupEntity relOperatorStatisticsGroupEntity);
	
	/**
	 * 操作员组与模板组关联RelOperatorStatisticsGroupEntity多个查询
	 * author huanghuang
	 * 2017年2月9日 下午1:32:05
	 * @param relOperatorStatisticsGroupEntity
	 * @return
	 */
	public abstract List<RelOperatorStatisticsGroupEntity> queryRelOperatorStatisticsGroups(RelOperatorStatisticsGroupEntity relOperatorStatisticsGroupEntity);


}
