package xyz.hasaki.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import xyz.hasaki.dao.CustomerDao;
import xyz.hasaki.po.Customer;

/**
 * Created by ywd on 2017/11/27.
 */
public class CustomerDaoImpl extends SqlSessionDaoSupport implements CustomerDao {
    public Customer findCustomerById(Integer id) {
        return getSqlSession().selectOne("dao.CustomerMapper.findCustomerById", id);
    }
}
