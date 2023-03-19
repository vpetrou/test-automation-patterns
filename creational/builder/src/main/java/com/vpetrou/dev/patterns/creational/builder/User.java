package com.vpetrou.dev.patterns.creational.builder;

public class User {

    private String name;

    private String address;

    private String id;

    private boolean enabled;

    public User(String name, String address, String id, boolean enabled) {
        this.name = name;
        this.address = address;
        this.id = id;
        this.enabled = enabled;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getId() {
        return id;
    }

    public boolean getEnabled() {
        return enabled;
    }
}
