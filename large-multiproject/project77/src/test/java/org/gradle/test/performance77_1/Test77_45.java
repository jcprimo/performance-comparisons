package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_45 {
    private final Production77_45 production = new Production77_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}