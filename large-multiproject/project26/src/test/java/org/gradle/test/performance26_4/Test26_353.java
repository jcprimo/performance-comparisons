package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_353 {
    private final Production26_353 production = new Production26_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}