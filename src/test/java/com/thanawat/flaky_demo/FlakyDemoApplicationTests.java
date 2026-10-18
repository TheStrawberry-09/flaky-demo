package com.thanawat.flaky_demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
@SpringBootTest
class FlakyDemoApplicationTests {

	@Test
	void contextLoads() {

	}
	@Test
	void additionWorks() {
		assertEquals(4, 2 + 2);
	}

	@Test
	void uppercaseWorks() {
		assertEquals("HELLO", "hello".toUpperCase());
	}

	@Test
	void flakyRandomTest() {
		assertTrue(Math.random() > 0.3);
	}

}
