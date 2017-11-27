package xyz.hasaki.mapper;

import xyz.hasaki.po.Customer;

/**
 * Created by ywd on 2017/11/27.
 */
public interface CustomerMapper {
    Customer finCustomerById(Integer id);

    void addCustomer(Customer customer);
}
