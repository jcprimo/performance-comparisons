package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_114 {
    private final Production60_114 production = new Production60_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}