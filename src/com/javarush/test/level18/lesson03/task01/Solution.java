package com.javarush.test.level18.lesson03.task01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String filename  = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        FileInputStream inStream = new FileInputStream(filename);
        int max = -1;
        while (inStream.available()>0)
        {
            int data = inStream.read();
            if (max<data)
            {
                max = data;
            }
        }
        inStream.close();
        System.out.println(max);
    }
}
