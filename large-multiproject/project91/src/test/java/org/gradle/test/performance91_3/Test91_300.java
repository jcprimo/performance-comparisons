package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_300 {
    private final Production91_300 production = new Production91_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}