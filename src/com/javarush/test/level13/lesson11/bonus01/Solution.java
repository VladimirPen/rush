package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        String fileName = br.readLine();
        List<Integer> list = new ArrayList<Integer>();
        FileInputStream fis = null;

        try
        {
            fis = new FileInputStream(fileName);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fis));

            String stmp = reader.readLine();
            while(stmp != null){
                if (Integer.parseInt(stmp) % 2 == 0)
                {
                    list.add(Integer.parseInt(stmp));
                }
                stmp = reader.readLine();
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                fis.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }

        Collections.sort(list);

        for (Integer i : list)
        {
            System.out.println(i);
        }
    }
}
