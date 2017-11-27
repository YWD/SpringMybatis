package xyz.hasaki.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.hasaki.mapper.CustomerMapper;
import xyz.hasaki.po.Customer;
import xyz.hasaki.service.CustomerService;

/**
 * Created by ywd on 2017/11/27.
 */
@Service
//@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;
    public void addCustomer(Customer customer) {
        customerMapper.addCustomer(customer);
        int i = 1 / 0;
    }
}
