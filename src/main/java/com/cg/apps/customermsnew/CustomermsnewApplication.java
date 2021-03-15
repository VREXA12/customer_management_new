package com.cg.apps.customermsnew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.cg.apps.customermsnew.ui.*;

@SpringBootApplication
public class CustomermsnewApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(CustomermsnewApplication.class, args);
	CustomerUI customerUI = context.getBean(CustomerUI.class);
	customerUI.start();
	}

}
