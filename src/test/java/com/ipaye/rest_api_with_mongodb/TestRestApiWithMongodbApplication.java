package com.ipaye.rest_api_with_mongodb;

import org.springframework.boot.SpringApplication;

public class TestRestApiWithMongodbApplication {

	public static void main(String[] args) {
		SpringApplication.from(RestApiWithMongodbApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
