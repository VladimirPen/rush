package com.javarush.test.level14.lesson06.home01;

public class RussianHen extends Hen
{

    @Override
    String getDescription()
    {
        return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }

    @Override
    int getCountOfEggsPerMonth()
    {
        return 0;
    }
}