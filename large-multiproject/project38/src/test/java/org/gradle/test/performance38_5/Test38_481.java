package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_481 {
    private final Production38_481 production = new Production38_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}