package com.javarush.test.level18.lesson03.task02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* Минимальный байт
Ввести с консоли имя файла
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String filename  = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        FileInputStream inStream = new FileInputStream(filename);
        int min = 0;
        boolean isMinExist = false;
        while (inStream.available()>0)
        {
            int data = inStream.read();
            if (!isMinExist || min>data)
            {
                min = data;
                isMinExist = true;
            }
        }
        inStream.close();
        System.out.println(min);
    }
}
