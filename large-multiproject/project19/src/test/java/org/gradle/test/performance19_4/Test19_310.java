package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_310 {
    private final Production19_310 production = new Production19_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}