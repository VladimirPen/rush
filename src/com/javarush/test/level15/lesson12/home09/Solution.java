package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Solution
{
    public static void main(String[] args)
    {

        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));

        try
        {
            String uRL = bufferRead.readLine();
            List<String> listParameters = Arrays.asList(uRL.substring(uRL.indexOf('?') + 1).split("&"));
            String objValue = null;
            for (String str : listParameters)
            {
                String parameterName;
                if (str.indexOf('=') > 0)
                {
                    parameterName = str.substring(0, str.indexOf('='));

                } else
                {
                    parameterName = str;
                }
                if (parameterName.equals("obj"))
                {
                    objValue = str.substring(str.indexOf('=') + 1);
                }
                System.out.print(parameterName + " ");
            }
            if (objValue != null)
            {
                System.out.println();
                try
                {
                    alert(Double.parseDouble(objValue));
                }
                catch (NumberFormatException e)
                {
                    alert(objValue);
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void alert(double value)
    {
        System.out.println("double " + value);
    }

    public static void alert(String value)
    {
        System.out.println("String " + value);
    }
}
