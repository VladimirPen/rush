package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();

        FileInputStream inputStream = new FileInputStream(filename1);
        FileOutputStream outputStream2 = new FileOutputStream(filename2);

        byte[] buffer = new byte[inputStream.available()];
        int count = 0;
        if(inputStream.available() > 0)
        {
            count = inputStream.read(buffer);
        }

        for (int i = count-1;i>=0;i--)
        {
            outputStream2.write(buffer[i]);
        }
        inputStream.close();
        outputStream2.close();
        reader.close();
    }
}
