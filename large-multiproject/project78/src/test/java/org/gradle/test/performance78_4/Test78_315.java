package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_315 {
    private final Production78_315 production = new Production78_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}