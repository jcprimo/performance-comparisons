package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_90 {
    private final Production29_90 production = new Production29_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}