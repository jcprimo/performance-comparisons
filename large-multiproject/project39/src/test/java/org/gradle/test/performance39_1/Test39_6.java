package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_6 {
    private final Production39_6 production = new Production39_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}