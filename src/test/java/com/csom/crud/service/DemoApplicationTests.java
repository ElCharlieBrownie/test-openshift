package com.csom.crud.service;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		ControllerCrud crl = new ControllerCrud();
		assertNull(crl, "valor");
	}
	
	@Test
	void testService() {
		ServiceCrud crl = new ServiceCrud();
		assertNull(crl, "valor");
	}
//	
//	@Test
//	void testService2() {
//		ControllerCrud crl = new ControllerCrud();
//		assertNull(crl.helloWorld(), "valor");
//		assertNull(crl.index(), "valor");
//	}

}
