package xyz.hasaki.dao;

import xyz.hasaki.po.Customer;

/**
 * Created by ywd on 2017/11/27.
 */
public interface CustomerDao {
    Customer findCustomerById(Integer id);
}
