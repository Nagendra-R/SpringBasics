package com.telusko;

import java.awt.peer.LabelPeer;

public class Laptop implements Computer {

    public Laptop(){
        System.out.println("Laptop Constructor");
    }

    public void laptopMethod(){
        System.out.println("laptop method");
    }

    @Override
    public void compile() {
        System.out.println("Compile in Laptop");
    }
}
