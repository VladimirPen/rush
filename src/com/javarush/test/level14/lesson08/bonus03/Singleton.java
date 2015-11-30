package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by vladi_000 on 11/24/2015.
 */
public class Singleton
{
    static Singleton singleton = null;

    private Singleton()
    {
    }

    public static Singleton getInstance()
    {
        if (singleton == null){
            singleton = new Singleton();
        }

        return singleton;
    }

}
