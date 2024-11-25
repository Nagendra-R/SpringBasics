package com.telusko;

public class Desktop  implements Computer{

    public Desktop() {
        System.out.println("Desktop Constructor");
    }

    @Override
    public void compile() {
        System.out.println("Compile in Desktop");
    }
}
