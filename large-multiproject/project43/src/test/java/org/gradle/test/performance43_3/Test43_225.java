package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_225 {
    private final Production43_225 production = new Production43_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}