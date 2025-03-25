package com.jad;

import java.util.ArrayList;

public class Foo implements IFoo {

    IBaz baz;
    ArrayList<IBar> bars;
    IQux qux;
    ICorge corge;

    public Foo(IBaz baz) {
        this.baz = baz;
        this.bars = new ArrayList<>();
    }

    public void setBaz(IBaz baz) {
        this.baz = baz;
    }

    public void setQux(IQux qux) {
        this.qux = qux;
    }

    public void setBars(ArrayList<IBar> bars) {
        this.bars = bars;
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
