package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_377 {
    private final Production39_377 production = new Production39_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}