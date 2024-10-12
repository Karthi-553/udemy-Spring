package com.karthik;

import java.beans.ConstructorProperties;

public class Alien {
   // private int salary;
    private int age;
    private Computer comp;
    Alien()
    {
        System.out.println("Alien Obj created");
    }

   // @ConstructorProperties({"age","lap"})
      public Alien(Computer comp, int age) {
        this.comp = comp;
        this.age = age;
    }
//    public Alien(Laptop lap, int age,int salary) {
//        this.lap = lap;
//        this.age = age;
//        this.salary=salary;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter Called");
        this.age = age;
    }
    /*
    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }
    */

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void code()
    {
        System.out.println("Coding..");
        comp.compile();
    }
}
