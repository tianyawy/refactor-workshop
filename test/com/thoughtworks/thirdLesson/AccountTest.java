package com.thoughtworks.thirdLesson;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Created by twer on 1/14/14.
 */
public class AccountTest {

    @Test
    public void should_bankCharge_is_14_when_account_type_is_101_and_day_is_8(){
        Account account = new Account(new AccountType(101, 8));

        assertThat(account.bankCharge(), is(15.35));

    }

    @Test
    public void should_bankCharge_is_14_when_account_type_is_101_and_day_is_6(){
        Account account = new Account(new AccountType(101, 6));

        assertThat(account.bankCharge(), is(14.5));
    }
}
