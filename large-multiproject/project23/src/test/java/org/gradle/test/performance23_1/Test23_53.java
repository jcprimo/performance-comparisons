package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_53 {
    private final Production23_53 production = new Production23_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}