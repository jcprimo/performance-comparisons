package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_114 {
    private final Production34_114 production = new Production34_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}