package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_419 {
    private final Production52_419 production = new Production52_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}