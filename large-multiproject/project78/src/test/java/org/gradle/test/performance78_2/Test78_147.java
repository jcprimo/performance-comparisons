package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_147 {
    private final Production78_147 production = new Production78_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}