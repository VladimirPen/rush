package com.javarush.test.level20.lesson02.task03;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Scanner;

/* Знакомство с properties
В методе fillInPropertiesMap считайте имя файла с консоли и заполните карту properties данными из файла.
Про .properties почитать тут - http://ru.wikipedia.org/wiki/.properties
Реализуйте логику записи в файл и чтения из файла для карты properties.
*/
public class Solution
{
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        InputStream inputStream = new FileInputStream(scanner.nextLine());
        load(inputStream);
    }

    public void save(OutputStream outputStream) throws Exception
    {
        Properties propertyObj = new Properties();
        for (Entry<String, String> property : properties.entrySet())
        {
            propertyObj.setProperty(property.getKey(), property.getValue());
        }
        propertyObj.store(outputStream, "properties");
    }

    public void load(InputStream inputStream) throws Exception
    {
        Properties propertyObj = new Properties();
        propertyObj.load(inputStream);
        for (Entry<Object, Object> property : propertyObj.entrySet())
        {
            properties.put(String.valueOf(property.getKey()), String.valueOf(property.getValue()));
        }
    }
}
