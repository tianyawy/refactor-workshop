package com.thoughtworks.clientStatus;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by twer on 6/7/14.
 */
public class ClientTest {
    @Test
    public void should_create_client_to_pending(){
        String testClient = "TestClient";
        Client client = new Client(testClient);

        assertThat(client.getName(), is(testClient));
        assertThat(client.getStatus(),is("pending"));
    }
}
