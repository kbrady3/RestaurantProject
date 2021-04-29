package dmacc.controller;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Customer;
import dmacc.beans.CustomerOrder;
import dmacc.beans.MenuItems;

/**
 * @author Jeremy Brannen - jrbrannen CIS175 Apr 5, 2021
 */
@Configuration
public class BeanConfiguration {

	@Bean
	public Customer customer() {
		Customer bean = new Customer();
		return bean;
	}

	@Bean
	public CustomerOrder order() {
		CustomerOrder bean = new CustomerOrder();
		return bean;
	}

	@Bean
	public MenuItems menu() {
		MenuItems bean = new MenuItems();
		return bean;
	}
}
