package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_126 {
    private final Production85_126 production = new Production85_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}