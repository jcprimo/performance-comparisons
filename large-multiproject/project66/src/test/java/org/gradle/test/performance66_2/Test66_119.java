package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_119 {
    private final Production66_119 production = new Production66_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}