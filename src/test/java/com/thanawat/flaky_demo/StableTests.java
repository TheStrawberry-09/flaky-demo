package com.thanawat.flaky_demo;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.fail;
class StableTests {

    @Test
    void additionWorks() {
        assertEquals(4, 2 + 2);
    }

    @Test
    void uppercaseWorks() {
        //Week 4 : made flaky on purpose (~15% of runs fail) to test change-point detection
        if (ThreadLocalRandom.current().nextDouble() < 0.15) {
            fail("random failure added for the FlakeSince change-point demo");
        }
        assertEquals("HELLO", "hello".toUpperCase());
    }
}