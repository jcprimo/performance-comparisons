package org.gradle.test.performance78_1;

import static org.junit.Assert.*;

public class Test78_37 {
    private final Production78_37 production = new Production78_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}