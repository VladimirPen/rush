package com.javarush.test.level18.lesson03.task05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;




/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
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
        Map<Integer,Integer> trMap= new TreeMap<Integer,Integer>(sAlp);
        for (Map.Entry<Integer, Integer> pair : trMap.entrySet())
        {
            System.out.print(pair.getKey() + " ");
        }
    }
}
