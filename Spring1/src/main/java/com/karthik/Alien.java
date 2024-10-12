package com.karthik;

public class Alien {
    private int age;
    private Laptop lap;
    Alien()
    {
        System.out.println("Alien Obj created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter Called");
        this.age = age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public void code()
    {
        System.out.println("Coding..");
        lap.compile();
    }
}
