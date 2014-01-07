package com.thoughtworks.secondLesson;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.thoughtworks.utils.*;

import java.io.Console;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Vector;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by twer on 1/7/14.
 */
public class ExampleOneTest extends TestCase {

    private Vector _Orders;
    private FakePrintStream _PrintStream;

    @Before
    public void setUp() throws Exception {
        _Orders = new Vector<Order>();
        _Orders.add(new Order(1, 2));
        _Orders.add(new Order(3, 2));
        _Orders.add(new Order(5, 4));

        _PrintStream = new FakePrintStream(new ObjectOutputStream(new OutputStream() {
            @Override
            public void write(int b) throws IOException {

            }
        }));

    }

    @After
    public void tearDown() throws Exception {
        _Orders = null;

    }

    @Test
    public void testPrintOwing() throws Exception {
        ExampleOne one = new ExampleOne(_PrintStream, _Orders, "test1");
        one.printOwing();

        assertThat(_PrintStream.OutString, is("****************************Customer************************name:test1amount:8.0"));

    }

}
