package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_251 {
    private final Production11_251 production = new Production11_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}