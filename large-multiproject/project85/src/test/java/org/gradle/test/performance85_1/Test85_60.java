package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_60 {
    private final Production85_60 production = new Production85_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}