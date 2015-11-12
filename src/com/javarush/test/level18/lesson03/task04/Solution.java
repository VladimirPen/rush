package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String filename  = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        FileInputStream inStream = new FileInputStream(filename);

        Map<Integer,Integer> sAlp = new HashMap<Integer,Integer>();

        while (inStream.available()>0)
        {
            int data = inStream.read();
            int cnt = 0;
            try
            {
                cnt = sAlp.get(data);
            }
            catch (NullPointerException e)
            {
                cnt = 0;
            }
            cnt++;
            sAlp.put(data,cnt);
        }
        inStream.close();
        int max = Collections.min(sAlp.values());
        for (Map.Entry<Integer, Integer> pair : sAlp.entrySet())
        {
            if (pair.getValue() == max)
            {
                System.out.print(pair.getKey());
            }
        }
    }
}
