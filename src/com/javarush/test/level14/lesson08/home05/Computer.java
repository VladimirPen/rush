package com.javarush.test.level14.lesson08.home05;

/**
 * Created by vladi_000 on 11/24/2015.
 */
public class Computer
{
    public void setMonitor(Monitor monitor)
    {
        this.monitor = monitor;
    }

    public void setMouse(Mouse mouse)
    {
        this.mouse = mouse;
    }

    public void setKeyboard(Keyboard keyboard)
    {
        this.keyboard = keyboard;
    }

    public Monitor getMonitor()
    {

        return monitor;
    }

    public Mouse getMouse()
    {
        return mouse;
    }

    public Keyboard getKeyboard()
    {
        return keyboard;
    }

    private Monitor monitor;
    private Mouse mouse;
    private Keyboard keyboard;


    public Computer()
    {
        this.monitor = new Monitor();
        this.mouse = new Mouse();
        this.keyboard = new Keyboard();
    }
}
