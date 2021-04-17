package dmacc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dmacc.beans.CustomerOrder;
import dmacc.beans.*;
import dmacc.controller.BeanConfiguration;

@SpringBootApplication
public class RestaurantProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantProjectApplication.class, args);
	}
}