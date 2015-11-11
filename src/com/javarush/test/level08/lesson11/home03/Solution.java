package com.javarush.test.level08.lesson11.home03;

import java.util.HashMap;
import java.util.Map;

/* Люди с одинаковыми именами и/или фамилиями
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList()
    {
        Map<String, String> result = new HashMap<String, String>();
        result.put("LastName1","FirstName1");
        result.put("LastName2","FirstName2");
        result.put("LastName3","FirstName3");
        result.put("LastName4","FirstName4");
        result.put("LastName5","FirstName5");
        result.put("LastName6","FirstName6");
        result.put("LastName7","FirstName1");
        result.put("LastName1","FirstName2");
        result.put("LastName2","FirstName3");
        result.put("LastName3","FirstName4");


        return result;
    }

    public static void printPeopleList(Map<String, String> map)
    {
        for (Map.Entry<String, String> s : map.entrySet())
        {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }

}
