package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_239 {
    private final Production19_239 production = new Production19_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}