package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_116 {
    private final Production82_116 production = new Production82_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}