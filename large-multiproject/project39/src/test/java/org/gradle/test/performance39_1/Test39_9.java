package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_9 {
    private final Production39_9 production = new Production39_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}