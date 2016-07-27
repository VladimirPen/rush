package com.javarush.test.level15.lesson12.bonus01;

/**
 * Created by corner on 25.07.2016.
 */
public class Plane implements Flyable
{

    private int countPassager;

    public Plane(int countPassager)
    {
        this.countPassager = countPassager;
    }

    @Override
    public void fly()
    {

    }

}
