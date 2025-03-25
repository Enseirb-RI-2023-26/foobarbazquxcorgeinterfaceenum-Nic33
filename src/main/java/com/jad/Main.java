package com.jad;

public class Main {
    public static void main(String[] args) {

        IBaz baz = EBaz.BAZ1;

        Foo foo = new Foo(baz);

    }
}
