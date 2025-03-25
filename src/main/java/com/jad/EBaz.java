package com.jad;

public enum EBaz implements IBaz {
    BAZ1("Baz1"),
    BAZ2("Baz2"),
    BAZ3("Baz3");

    String name;

    EBaz(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void doSomethingLikeABaz() {

    }

}
