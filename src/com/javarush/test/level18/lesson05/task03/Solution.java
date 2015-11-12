package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();
        String filename3 = reader.readLine();

        FileInputStream inputStream = new FileInputStream(filename1);
        FileOutputStream outputStream2 = new FileOutputStream(filename2);
        FileOutputStream outputStream3 = new FileOutputStream(filename3);

        byte[] buffer = new byte[inputStream.available()];
        int count = 0;
        if(inputStream.available() > 0)
        {
            count = inputStream.read(buffer);
        }


        for (int i = 0;i<Math.round((float) count / 2);i++)
        {
            outputStream2.write(buffer[i]);
        }
        for (int i = Math.round((float) count / 2);i<count;i++)
        {
            outputStream3.write(buffer[i]);
        }

        inputStream.close();
        outputStream2.close();
        outputStream3.close();
        reader.close();
    }
}
