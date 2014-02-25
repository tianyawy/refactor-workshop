package com.thoughtworks.fiveLesson;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {
    private Person _Instance;

    @Before
    public void setUp() throws Exception {
        _Instance = new Person(Person.A);
    }

    @Test
    public void testBloodGroup() throws Exception {
        Assert.assertEquals(_Instance.get_bloodGroup(), Person.A);
    }

    @After
    public void tearDown() throws Exception {
        _Instance = null;

    }
}
