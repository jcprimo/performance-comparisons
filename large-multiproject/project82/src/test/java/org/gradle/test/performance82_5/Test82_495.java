package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_495 {
    private final Production82_495 production = new Production82_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}