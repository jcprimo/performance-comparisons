package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_58 {
    private final Production33_58 production = new Production33_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}