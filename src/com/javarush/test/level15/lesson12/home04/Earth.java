package com.javarush.test.level15.lesson12.home04;

/**
 * Created by vladi_000 on 11/30/2015.
 */
public class Earth implements Planet
{
    public static Earth instance = new Earth();

    private Earth()
    {

    }

    public static Earth getInstance()
    {
        return instance;
    }
}
