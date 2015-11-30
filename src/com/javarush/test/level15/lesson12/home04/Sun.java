package com.javarush.test.level15.lesson12.home04;

/**
 * Created by vladi_000 on 11/30/2015.
 */
public class Sun implements Planet
{
    public static Sun instance = new Sun();

    private Sun()
    {

    }

    public static Sun getInstance()
    {
        return instance;
    }
}
