package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_282 {
    private final Production45_282 production = new Production45_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}