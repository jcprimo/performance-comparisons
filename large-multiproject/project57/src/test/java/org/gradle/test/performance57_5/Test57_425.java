package org.gradle.test.performance57_5;

import static org.junit.Assert.*;

public class Test57_425 {
    private final Production57_425 production = new Production57_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}