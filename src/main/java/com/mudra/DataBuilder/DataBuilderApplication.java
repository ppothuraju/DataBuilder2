package com.mudra.DataBuilder;


import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@ComponentScan({"com.mudra.DataBuilder.Controller","com.mudra.DataBuilder.DataStore","com.mudra.DataBuilder.Services","com.mudra.DataBuilder.Utils"})
//@EntityScan("com.mudra.DataBuilder.Entity")
//@EnableJpaRepositories("com.mudra.DataBuilder.repo")
@SpringBootApplication
public class DataBuilderApplication  {

	public static void main(String[] args) {

		SpringApplication.run(DataBuilderApplication.class, args);

	}

}
