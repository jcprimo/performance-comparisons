package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_85 {
    private final Production20_85 production = new Production20_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}