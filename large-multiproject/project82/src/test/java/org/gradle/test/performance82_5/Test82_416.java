package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_416 {
    private final Production82_416 production = new Production82_416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}