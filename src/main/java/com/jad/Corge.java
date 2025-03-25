package com.jad;

public class Corge implements ICorge {

    private final IFoo foo;

    public Corge(IFoo foo) {
        this.foo = foo;
    }

    @Override
    public IFoo getFoo() {
        return this.foo;
    }

    @Override
    public void setFoo(IFoo foo) {

    }
}
