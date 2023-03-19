package com.vpetrou.dev.patterns.creational.builder;

public class UserBuilder {

    private String id;

    private String name;

    private String address;

    private boolean enabled;

    UserBuilder() {
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    public UserBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public UserBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public UserBuilder setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public User build() {
        return new User(name, address, id, enabled);
    }

}
