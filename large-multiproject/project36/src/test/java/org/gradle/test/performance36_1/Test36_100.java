package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_100 {
    private final Production36_100 production = new Production36_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}