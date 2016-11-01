package com.in6k.tests.first;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SelfVerifyingPrincipleTest {
    @Test
    public void doNotUseConsoleLoggingForManualResultTests() throws Exception {
        int expected =4;
        int result = 2 + 2;
        assertEquals(expected,result);

    }
}