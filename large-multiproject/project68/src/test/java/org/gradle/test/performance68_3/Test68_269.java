package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_269 {
    private final Production68_269 production = new Production68_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}