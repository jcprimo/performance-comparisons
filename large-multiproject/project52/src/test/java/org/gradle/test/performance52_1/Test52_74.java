package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_74 {
    private final Production52_74 production = new Production52_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}