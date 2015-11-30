package com.javarush.test.level18.lesson05.task05;

/* DownloadException
1 Считывать с консоли имена файлов.
2 Если файл меньше 1000 байт, то:
2.1 Закрыть потоки
2.2 выбросить исключение DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename;
        FileInputStream inputStream;

        while (true)
        {
            filename = reader.readLine();
            inputStream = new FileInputStream(filename);
            int count;
            byte[] buffer = new byte[inputStream.available()];

            if (buffer.length < 1000)
            {
                inputStream.close();
                reader.close();
                throw new DownloadException();
            }
            inputStream.close();
        }


    }

    public static class DownloadException extends Exception{

    }
}
