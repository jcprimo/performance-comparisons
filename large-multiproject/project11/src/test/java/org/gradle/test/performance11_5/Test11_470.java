package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_470 {
    private final Production11_470 production = new Production11_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}