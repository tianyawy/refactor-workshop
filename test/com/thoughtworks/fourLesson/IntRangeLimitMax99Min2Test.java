package com.thoughtworks.fourLesson;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by twer on 2/18/14.
 */
public class IntRangeLimitMax99Min2Test extends TestCase {
    private IntRangeLimitMax99Min3 _Instance;

    @Before
    public void setUp() throws Exception {
        _Instance = new IntRangeLimitMax99Min3();
    }

    @Test
    public void testPrintOwing() throws Exception {
        _Instance.SetHigh(100);
        _Instance.SetLow(0);
        assertEquals(_Instance.GetAve(), 51);
    }

    @After
    public void tearDown() throws Exception {
        _Instance = null;

    }
}