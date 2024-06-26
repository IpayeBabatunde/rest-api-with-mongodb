package com.ipaye.rest_api_with_mongodb;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class RestApiWithMongodbApplicationTests {

	@Test
	void contextLoads() {
	}

}
