package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_119 {
    private final Production11_119 production = new Production11_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}