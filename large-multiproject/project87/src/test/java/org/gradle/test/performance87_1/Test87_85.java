package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_85 {
    private final Production87_85 production = new Production87_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}