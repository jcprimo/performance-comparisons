package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_36 {
    private final Production29_36 production = new Production29_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}