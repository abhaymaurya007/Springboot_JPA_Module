package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.Service.CityService;
import com.nit.config.AppProperties;

@EnableConfigurationProperties(AppProperties.class)
@SpringBootApplication
public class Proj10AssignDataInListApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Proj10AssignDataInListApplication.class, args);
		 
		CityService bean = run.getBean("cityService",CityService.class);
		bean.printCities();
		run.close();

	}

}
