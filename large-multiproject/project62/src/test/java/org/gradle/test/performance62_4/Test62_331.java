package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_331 {
    private final Production62_331 production = new Production62_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}