package com.example.demo;

import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;


import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

//import org.springframework.boot.webservlet.LocalServerPort;


import static org.hamcrest.CoreMatchers.is;
import org.springframework.test.context.junit4.SpringRunner;

//import org springframework.boot.test.context.

//@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class DemoApplicationTests {
	TestRestTemplate restTemplate = new TestRestTemplate();

	@Test
	void contextLoads() {
	}

}
