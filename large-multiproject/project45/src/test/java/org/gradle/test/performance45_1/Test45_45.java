package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_45 {
    private final Production45_45 production = new Production45_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}