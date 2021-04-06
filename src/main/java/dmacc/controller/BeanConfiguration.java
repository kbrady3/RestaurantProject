package dmacc.controller;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Customer;
import dmacc.beans.Menu;
import dmacc.beans.Order;

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
	public Order order() {
		Order bean = new Order();
		return bean;
	}

	@Bean
	public Menu menu() {
		Menu bean = new Menu();
		return bean;
	}
}
