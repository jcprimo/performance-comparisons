package org.gradle.test.performance69_1;

import static org.junit.Assert.*;

public class Test69_85 {
    private final Production69_85 production = new Production69_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}