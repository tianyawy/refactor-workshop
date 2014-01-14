package com.thoughtworks.thirdLesson;

import org.junit.Test;
import sun.security.ssl.Debug;

import java.io.Console;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Created by twer on 1/14/14.
 */
public class AccountTest {

    @Test
    public void TestOverdraftCharge(){
        Account account = new Account(new AccountType(100));

        assertThat(account.overdraftCharge(), is(0.0));

    }
}
