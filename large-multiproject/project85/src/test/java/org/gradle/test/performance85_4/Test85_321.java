package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_321 {
    private final Production85_321 production = new Production85_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}