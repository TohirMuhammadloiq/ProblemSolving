package com.muhammadloiq;
public class Fish extends Animal {
    private int gills;
    private int eyse;
    private int fins;

    public Fish(String name, int size, int weigh, int gills, int eyse, int fins) {
        super(name, 1, 1, size, weigh);
        this.gills = gills;
        this.eyse = eyse;
        this.fins = fins;
    }

    public void rest()
    {

    }

    public void moveMuscles()
    {

    }

    public void moveBackFin()
    {

    }

    public void swim(int speed)
    {
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}
