package com.in6k.tests.first;


import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class IndependentPrincipleTest {

    @org.junit.Test
    public void test2() throws Exception {
        int result = 0;
        result += 4;
        assertEquals(4, result);
    }

    @org.junit.Test
    @Ignore
    public void test1() throws Exception {
        int result = 0;
        result += 2;
        assertEquals(2, result);
    }
}