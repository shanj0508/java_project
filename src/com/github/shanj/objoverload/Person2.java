package com.github.shanj.objoverload;

class Person2 {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName(String lastname, String firstname) {
        this.name = lastname + firstname;

    }
}
