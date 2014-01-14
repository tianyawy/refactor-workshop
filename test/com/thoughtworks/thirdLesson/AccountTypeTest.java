package com.thoughtworks.thirdLesson;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by twer on 1/14/14.
 */
public class AccountTypeTest {
    @Test
    public void should_is_premium_when_account_type_is_more_than_1000(){
        AccountType type = new AccountType(101);
        assertThat(type.isPremium(), is(true));
    }

    @Test
    public void should_is_not_premium_when_account_type_is_less_than_1000(){
        AccountType type = new AccountType(99);
        assertThat(type.isPremium(), is(false));
    }


}
