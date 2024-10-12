package com.karthik;

public class Laptop implements Computer{
//    Laptop()
//    {
//        System.out.println("Laptop Obj created");
//    }
    @Override
    public void compile()
    {
        System.out.println("Compiling using Laptop");
    }
}
