package com.jad;

import java.util.ArrayList;

public class Foo implements IFoo {

    IBaz baz;
    ArrayList<IBar> bars;
    IQux qux;
    private ICorge corge;

    public Foo(IBaz baz) {
        this.baz = baz;
        this.bars = new ArrayList<>();
    }

    public void addBar(IBar bar) {
        this.bars.add(bar);
    }

    @Override
    public ICorge getCorge() {
        return this.corge;
    }
}
