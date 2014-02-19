package com.thoughtworks.fourLesson;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by twer on 2/18/14.
 */
public class IntRangeLimitMax100Min0Test extends TestCase {
    private IntRange _Instance;

    @Before
    public void setUp() throws Exception {
        _Instance = new IntRangeLimitMax100Min0();
    }

    @Test
    public void testPrintOwing() throws Exception {
        _Instance.low = 101;
        _Instance.high = -1;
        assertEquals(_Instance.GetAve(),50);
        assertEquals(_Instance.low,101);
        assertEquals(_Instance.high,-1);

    }

    @After
    public void tearDown() throws Exception {
        _Instance = null;

    }
}
