package com.thoughtworks.clientStatus;

/**
 * Created by twer on 6/7/14.
 */
public class Client {

    private final String name;
    private String status;

    public Client(String name) {
        this.name = name;
        status = "pending";
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }
}
