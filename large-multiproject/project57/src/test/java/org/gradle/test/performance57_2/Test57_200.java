package org.gradle.test.performance57_2;

import static org.junit.Assert.*;

public class Test57_200 {
    private final Production57_200 production = new Production57_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}