package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_28 {
    private final Production19_28 production = new Production19_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}