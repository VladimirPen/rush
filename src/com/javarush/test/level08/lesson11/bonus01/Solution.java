package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();
        Map<String, Integer> months= new HashMap<String, Integer>();
        months.put("JANUARY",1);
        months.put("FEBRUARY",2);
        months.put("MARCH",3);
        months.put("APRIL",4);
        months.put("MAY",5);
        months.put("JUNE",6);
        months.put("JULY",7);
        months.put("AUGUST",8);
        months.put("SEPTEMBER",9);
        months.put("OCTOBER",10);
        months.put("NOVEMBER",11);
        months.put("DECEMBER",12);


        System.out.println(month + " is " + (months.get(month.toUpperCase())) + " month");

    }

}
