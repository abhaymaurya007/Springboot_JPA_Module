package com.nit;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.Service.FetchEmployeeData;




@SpringBootApplication
public class Proj11_ProfileInJava {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Proj11_ProfileInJava.class, args);
	     
		FetchEmployeeData fed=run.getBean("fetchEmployeeData",FetchEmployeeData.class);
		
		fed.getData();
		
	
	     run.close();
	     
	
	
	
	
	
	
	
	
	
	
	}

}
