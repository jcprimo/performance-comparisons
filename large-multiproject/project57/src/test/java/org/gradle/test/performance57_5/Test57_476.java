package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_476 {
    private final Production57_476 production = new Production57_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}