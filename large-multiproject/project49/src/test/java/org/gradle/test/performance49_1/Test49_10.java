package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_10 {
    private final Production49_10 production = new Production49_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}