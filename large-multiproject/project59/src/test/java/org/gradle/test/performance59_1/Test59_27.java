package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_27 {
    private final Production59_27 production = new Production59_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}