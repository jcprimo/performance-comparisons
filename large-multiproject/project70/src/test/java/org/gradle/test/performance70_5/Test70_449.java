package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_449 {
    private final Production70_449 production = new Production70_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}