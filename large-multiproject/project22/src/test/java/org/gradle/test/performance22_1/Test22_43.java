package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_43 {
    private final Production22_43 production = new Production22_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}