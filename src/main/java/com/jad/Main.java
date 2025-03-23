package com.jad;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        IBaz baz = EBaz.BAZ1;

        Foo foo = new Foo(baz);

        IBar bar = new Bar();
        foo.addBar(bar);

        IQux qux = new Qux();
        foo.setQux(qux);

        baz.doSomethingLikeABaz();
        bar.doSomethingLikeABar();
        qux.doSomethingLikeAQux();


    }
}
