package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_43 {
    private final Production44_43 production = new Production44_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}