package com.javarush.test.level08.lesson11.home09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
       // System.out.println(d.toString());
       isDateOdd("MAY 1 2013");
    }

    public static boolean isDateOdd(String date)
    {
        Date d = new Date(date);
        Date d1 = new Date(date);
        d1.setHours(0);
        d1.setMinutes(0);
        d1.setSeconds(0);
        d1.setMonth(0);
        d1.setDate(1);
        long diff = d.getTime() - d1.getTime();
        diff /= 24 * 60 * 60 * 1000;

        return (diff % 2 == 0);
    }
}
