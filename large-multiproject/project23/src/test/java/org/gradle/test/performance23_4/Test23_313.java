package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_313 {
    private final Production23_313 production = new Production23_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}