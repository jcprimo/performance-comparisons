package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_475 {
    private final Production94_475 production = new Production94_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}