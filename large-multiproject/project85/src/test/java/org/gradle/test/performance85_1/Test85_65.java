package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_65 {
    private final Production85_65 production = new Production85_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}