package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_289 {
    private final Production39_289 production = new Production39_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}