package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_371 {
    private final Production78_371 production = new Production78_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}