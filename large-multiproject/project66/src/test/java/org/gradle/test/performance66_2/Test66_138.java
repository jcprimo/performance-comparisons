package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_138 {
    private final Production66_138 production = new Production66_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}