package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_461 {
    private final Production94_461 production = new Production94_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}