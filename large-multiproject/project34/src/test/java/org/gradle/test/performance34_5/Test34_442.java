package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_442 {
    private final Production34_442 production = new Production34_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}