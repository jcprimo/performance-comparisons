package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_315 {
    private final Production97_315 production = new Production97_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}