package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_204 {
    private final Production39_204 production = new Production39_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}