package com.javarush.test.level15.lesson12.home01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* Разные методы для разных типов
1. Считать с консоли данные, пока не введено слово "exit".
2. Для каждого значения вызвать метод print. Если значение:
2.1. содержит точку '.', то вызвать метод print для Double;
2.2. больше нуля, но меньше 128, то вызвать метод print для short;
2.3. больше либо равно 128, то вызвать метод print для Integer;
2.4. иначе, вызвать метод print для String.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String console = reader.readLine();
        while (!console.equals("exit"))
        {

            try{
                if (console.contains("."))
                {
                    double Dbl = Double.parseDouble(console);
                    print(Dbl);
                }
                else if (Integer.parseInt(console)>0 && Integer.parseInt(console)<128)
                {
                    short Shorts = (short)Integer.parseInt(console);
                    print(Shorts);
                }
                else if (Integer.parseInt(console)>=128)
                {
                    int Inter = Integer.parseInt(console);
                    print(Inter);
                }
                else print(console);
            }
            catch (NumberFormatException e)
            {
                print(console);
            }
            console = reader.readLine();
        }

    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}