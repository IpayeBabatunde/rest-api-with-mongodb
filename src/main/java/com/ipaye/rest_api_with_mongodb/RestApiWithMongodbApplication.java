package com.ipaye.rest_api_with_mongodb;

import com.github.cloudyrock.spring.v5.EnableMongock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableMongock
public class RestApiWithMongodbApplication {

	public static void main(String[] args) {

		SpringApplication.run(RestApiWithMongodbApplication.class, args);
	}

}
