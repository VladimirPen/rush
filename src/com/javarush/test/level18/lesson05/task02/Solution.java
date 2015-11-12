package com.javarush.test.level18.lesson05.task02;

/* Подсчет запятых
С консоли считать имя файла
Посчитать в файле количество символов ',', количество вывести на консоль
Закрыть потоки. Не использовать try-with-resources

Подсказка: нужно сравнивать с ascii-кодом символа ','
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        FileInputStream inStream = new FileInputStream(filename);
        int cnt = 0;

        while(inStream.available() > 0)
        {
            int data = inStream.read();
            if (data == 44)
            {
                cnt ++;
            }
        }
        System.out.println(cnt);
        inStream.close();
        reader.close();
    }
}
