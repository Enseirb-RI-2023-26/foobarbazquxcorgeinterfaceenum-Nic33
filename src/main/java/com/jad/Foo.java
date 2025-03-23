package com.jad;

import java.util.ArrayList;

public class Foo {

    IBaz baz;
    ArrayList<IBar> bars;
    IQux qux;
    private ICorge corge;

    Foo(IBaz baz) {
        this.baz = baz;
        this.bars = new ArrayList<>(); // Correction : Initialisation de bars
    }

    public void addBar(IBar bar) {
        this.bars.add(bar);
    }

    public void setQux(IQux qux) {
        this.qux = qux;
    }

    public void setCorge(ICorge corge) {
        this.corge = corge;
    }

}
