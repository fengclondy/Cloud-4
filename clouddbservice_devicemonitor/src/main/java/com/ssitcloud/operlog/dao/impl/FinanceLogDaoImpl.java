package com.ssitcloud.operlog.dao.impl;

import org.springframework.stereotype.Repository;

import com.ssitcloud.common.system.MongoDBImpl;
import com.ssitcloud.operlog.dao.FinanceLogDao;

@Repository
public class FinanceLogDaoImpl extends MongoDBImpl implements FinanceLogDao {

}
