package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_396 {
    private final Production91_396 production = new Production91_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}