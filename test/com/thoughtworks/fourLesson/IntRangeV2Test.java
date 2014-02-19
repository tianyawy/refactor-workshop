package com.thoughtworks.fourLesson;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by twer on 2/19/14.
 */
public class IntRangeV2Test extends TestCase {
    private IntRangeV2 _Instance;

    @Before
    public void setUp() throws Exception {
        _Instance = new IntRangeV2();
    }

    @Test
    public void testPrintOwing() throws Exception {
        _Instance.setLow(0);
        _Instance.setHigh(10);
        assertEquals(_Instance.GetAve(),5);

    }

    @After
    public void tearDown() throws Exception {
        _Instance = null;

    }
}
