package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{

    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        for (int i=0;i<10;i++){
            map.put("test" + i,"test" + i + i);
        }
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int cnt = 0;
        for(String value : map.values()){
            if (value.equals(name)){
                cnt++;
            }
        }
        return cnt;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int cnt = 0;
        for(String value : map.keySet()){
            if (value.equals(familiya)){
                cnt++;
            }
        }
        return cnt;
    }
}
