package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_147 {
    private final Production97_147 production = new Production97_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}