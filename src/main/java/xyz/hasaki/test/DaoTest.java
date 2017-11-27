package xyz.hasaki.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.hasaki.dao.CustomerDao;
import xyz.hasaki.mapper.CustomerMapper;
import xyz.hasaki.po.Customer;

/**
 * Created by ywd on 2017/11/27.
 */
public class DaoTest {
    @Test
    public void findCustomerByIdDaoTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        CustomerDao customerDao = applicationContext.getBean(CustomerDao.class);
        Customer customer = customerDao.findCustomerById(1);
        System.out.println(customer);
    }

    @Test
    public void findCustomerByIdMapperTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        CustomerMapper customerMapper = applicationContext.getBean(CustomerMapper.class);
        Customer customer = customerMapper.finCustomerById(1);
        System.out.println(customer);
    }
}
