package com.UnitTesting.UnitTest;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
class UnitTestApplicationTests {

	@Autowired
	private UnitTestApplication unitTestApplication;

	@Test
	public void testSum() {
		int result = unitTestApplication.sum(2, 3);
		assertEquals(5, result);
	}
}
