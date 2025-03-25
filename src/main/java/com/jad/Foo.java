package com.jad;

import java.util.ArrayList;

public class Foo implements IFoo {

    private final IBaz baz;
    ArrayList<IBar> bars;
    IQux qux;
    ICorge corge;

    public Foo(IBaz baz) {
        this.baz = baz;
        this.bars = new ArrayList<>();
    }

    public IBaz getBaz() {
        return this.baz;
    }

    public ArrayList<IBar> getBars() {
        return this.bars;
    }

    public IQux getQux() {
        return this.qux;
    }


    public void addBar(IBar bar) {
        this.bars.add(bar);
    }

    @Override
    public ICorge getCorge() {
        return this.corge;
    }

    @Override
    public void setCorge(ICorge corge) {
        this.corge = corge;
    }

}
