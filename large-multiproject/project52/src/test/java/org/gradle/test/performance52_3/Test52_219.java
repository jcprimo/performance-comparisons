package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_219 {
    private final Production52_219 production = new Production52_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}