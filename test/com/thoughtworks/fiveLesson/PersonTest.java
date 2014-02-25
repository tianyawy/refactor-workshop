package com.thoughtworks.fiveLesson;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by twer on 2/25/14.
 */
public class PersonTest extends TestCase {
    private Person _Instance;

    @Before
    public void setUp() throws Exception {
        _Instance = new Person(Person.A);
    }

    @Test
    public void testBloodGroup() throws Exception {
        assertEquals(_Instance.get_bloodGroup(), Person.A);
    }

    @After
    public void tearDown() throws Exception {
        _Instance = null;

    }
}
