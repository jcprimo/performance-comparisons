package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_253 {
    private final Production46_253 production = new Production46_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}