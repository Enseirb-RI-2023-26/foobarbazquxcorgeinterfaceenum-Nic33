package com.jad;

public class Corge implements ICorge {

    private final IFoo foo;

    public Corge(IFoo foo) {
        this.foo = foo;
    }
}
