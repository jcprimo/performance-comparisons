package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_49 {
    private final Production79_49 production = new Production79_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}