package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_234 {
    private final Production99_234 production = new Production99_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}