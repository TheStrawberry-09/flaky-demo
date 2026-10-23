package com.thanawat.flaky_demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StableTests {

    @Test
    void additionWorks() {
        assertEquals(4, 2 + 2);
    }

    @Test
    void uppercaseWorks() {
        assertEquals("HELLO", "hello".toUpperCase());
    }
}