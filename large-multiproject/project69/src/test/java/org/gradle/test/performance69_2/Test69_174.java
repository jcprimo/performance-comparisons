package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_174 {
    private final Production69_174 production = new Production69_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}