package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_479 {
    private final Production19_479 production = new Production19_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}