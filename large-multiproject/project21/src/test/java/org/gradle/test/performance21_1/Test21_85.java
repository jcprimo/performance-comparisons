package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_85 {
    private final Production21_85 production = new Production21_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}