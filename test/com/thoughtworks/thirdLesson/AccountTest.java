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
        AccountType accountType = AccountType.createAccountType(101, 8,10.0);
        Account account = new Account(accountType);

        assertThat(account.bankCharge(), is(15.35));

    }

    @Test
    public void should_bankCharge_is_14_when_account_type_is_101_and_day_is_6(){
        AccountType accountType = AccountType.createAccountType(101, 6,10.0);
        Account account = new Account(accountType);

        assertThat(account.bankCharge(), is(14.5));
    }


    @Test
    public void should_get_interest_by_amount_days(){
        AccountType accountType = AccountType.createAccountType(101, 6,10.0);
        Account account = new Account(accountType);

        assertThat(account.interestForAmount_days(20,5), is(2.73972602739726));
    }
}
