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
        Account account = Account.createAccount(new AccountType(101, 8),15.35);
        assertThat(account.bankCharge(), is(15.35));
    }

    @Test
    public void should_bankCharge_is_14_when_account_type_is_101_and_day_is_6(){
        Account account = Account.createAccount(new AccountType(101, 6),0.0);

        assertThat(account.bankCharge(), is(14.5));
    }


    @Test
    public void should_interestRate(){
        Account account = Account.createAccount(new AccountType(101, 6),10.0);

        assertThat(account.interestedForAmount_days(5.0, 6), is(0.821917808219178));


    }
}
