package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_404 {
    private final Production42_404 production = new Production42_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}