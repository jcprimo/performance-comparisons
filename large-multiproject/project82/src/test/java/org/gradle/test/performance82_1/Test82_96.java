package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_96 {
    private final Production82_96 production = new Production82_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}