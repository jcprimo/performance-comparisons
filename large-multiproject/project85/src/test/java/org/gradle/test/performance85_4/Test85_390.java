package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_390 {
    private final Production85_390 production = new Production85_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}