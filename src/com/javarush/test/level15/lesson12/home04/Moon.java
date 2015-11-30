package com.javarush.test.level15.lesson12.home04;

/**
 * Created by vladi_000 on 11/30/2015.
 */
public class Moon implements Planet
{
    public static Moon instance = new Moon();

    private Moon()
    {

    }

    public static Moon getInstance()
    {
        return instance;
    }
}
