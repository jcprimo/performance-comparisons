package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_353 {
    private final Production54_353 production = new Production54_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}