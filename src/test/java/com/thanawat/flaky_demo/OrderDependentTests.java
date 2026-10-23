package com.thanawat.flaky_demo;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.Random.class)
class OrderDependentTests {

    static int counter = 0;

    @Test
    void incrementsCounter() {
        counter++;
        assertTrue(counter >= 1);
    }

    @Test
    void expectsFreshCounter() {
        assertEquals(0, counter);
    }
}