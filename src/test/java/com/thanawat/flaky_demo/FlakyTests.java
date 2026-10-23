package com.thanawat.flaky_demo;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.assertTrue;

class FlakyTests {

    @Test
    void randomResult() {
        assertTrue(Math.random() > 0.3);
    }

    @Test
    void finishesWithinDeadline() throws InterruptedException {
        long start = System.nanoTime();

        Thread.sleep(ThreadLocalRandom.current().nextInt(50, 140));

        long elapsedMs = (System.nanoTime() - start) / 1_000_000;
        assertTrue(elapsedMs < 130, "took " + elapsedMs + " ms");
    }
}