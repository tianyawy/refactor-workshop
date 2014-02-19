package com.thoughtworks.fourLesson;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by twer on 2/19/14.
 */
public class IntRangeV2LimitMax100Min0Test extends TestCase {
    private IntRangeV2 _Instance;

    @Before
    public void setUp() throws Exception {
        _Instance = new IntRangeV2LimitMax100Min0();
    }

    @Test
    public void testPrintOwing() throws Exception {
        _Instance.setLow(-1);
        _Instance.setHigh(101);
        assertEquals(_Instance.GetAve(),50);

    }

    @After
    public void tearDown() throws Exception {
        _Instance = null;

    }
}
