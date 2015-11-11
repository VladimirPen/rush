package com.javarush.test.level08.lesson08.task04;

import java.util.*;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static void main(String[] args){
        HashMap<String, Date> hs = createMap();
        System.out.println(hs.toString());
        removeAllSummerPeople(hs);
        System.out.println(hs.toString());
    }

    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        Date d1 = new Date("MAY 1 1980");
        Date d2 = new Date("JULY 1 1980");

        for (int i=0;i<10;i++){
            if (i % 2 == 0){
                map.put("Stallone" + i, d1);
            }
            else{
                map.put("Stallone" + i, d2);
            }
        }
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> itr = map.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<String, Date> pair = itr.next();
            if (pair.getValue().getMonth() == 5 || pair.getValue().getMonth() == 6 || pair.getValue().getMonth() == 7){
                itr.remove();
            }
        }

    }
}
