package xyz.hasaki.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.hasaki.po.Customer;
import xyz.hasaki.service.CustomerService;

/**
 * Created by ywd on 2017/11/27.
 */
public class TransactionTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        CustomerService customerService = applicationContext.getBean(CustomerService.class);
        Customer customer = new Customer();
        customer.setUsername("zhangsan");
        customer.setJobs("manager");
        customer.setPhone("13233334444");
        customerService.addCustomer(customer);
    }
}
