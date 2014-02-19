package com.thoughtworks.fourLesson;

import com.thoughtworks.secondLesson.ExampleOne;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by twer on 2/18/14.
 */
public class IntRangeTest extends TestCase {
    private IntRange _Instance;

    @Before
    public void setUp() throws Exception {
        _Instance = new IntRange();
    }

    @Test
    public void testPrintOwing() throws Exception {
        _Instance.low = 0;
        _Instance.high = 10;
        assertEquals(_Instance.GetAve(),5);

    }

    @After
    public void tearDown() throws Exception {
        _Instance = null;

    }
}
