package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{

    public static Integer getNOD (Integer a, Integer b)
    {
        while (b >= a)
        {
            b -= a;
        }
        if (b == 0)
        {
            return a;
        }
        else
        {
            return getNOD(b,a);
        }
    }

    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Integer a = Integer.parseInt(bufferedReader.readLine());
        Integer b = Integer.parseInt(bufferedReader.readLine());
        System.out.println(getNOD(Math.min(a,b),Math.max(a,b)));
    }
}
