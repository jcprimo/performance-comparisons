package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_145 {
    private final Production33_145 production = new Production33_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}