package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_229 {
    private final Production62_229 production = new Production62_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}