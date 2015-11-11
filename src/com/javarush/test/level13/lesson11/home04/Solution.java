package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        String tmp = "";
        FileOutputStream outputStream = new FileOutputStream(fileName);
        while (!(tmp = br.readLine()).equals("exit")){
            outputStream.write(tmp.getBytes());
            outputStream.write(10);
            //outputStream.write(13);
        }
        outputStream.write(tmp.getBytes());
        outputStream.close();
    }
}
