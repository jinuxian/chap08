package com.example.demo;

import javax.inject.Inject;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Chap08Application implements CommandLineRunner {
	
	@Inject
	DataSource ds;

	public static void main(String[] args) {
	//	SpringApplication.run(Chap08Application.class, args);
		SpringApplication application = new SpringApplication(Chap08Application.class);
		application.setAdditionalProfiles("mysql");
	//	application.setAdditionalProfiles("oracle");
		application.run(args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("###");
		System.out.println("###" + ds.getDriverClassName());
		System.out.println("###" + ds.getUrl());
		System.out.println("###");
	}
}
