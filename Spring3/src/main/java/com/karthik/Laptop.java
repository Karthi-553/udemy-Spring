package com.karthik;

public class Laptop implements Computer{
    Laptop()
    {
        System.out.println("Laptop Obj created");
    }
    public void compile()
    {
        System.out.println("compiling with Laptop");
    }
}
