package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        Map<String, Cat> res = new HashMap<String, Cat>();
        res.put("cat0", new Cat("cat0"));
        res.put("cat1", new Cat("cat1"));
        res.put("cat2", new Cat("cat2"));
        res.put("cat3", new Cat("cat3"));
        res.put("cat4", new Cat("cat4"));
        res.put("cat5", new Cat("cat5"));
        res.put("cat6", new Cat("cat6"));
        res.put("cat7", new Cat("cat7"));
        res.put("cat8", new Cat("cat8"));
        res.put("cat9", new Cat("cat9"));
        return res;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set<Cat> res = new HashSet<Cat>();
        for (Map.Entry<String, Cat> pair : map.entrySet()){
            res.add(pair.getValue());
        }
        return res;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
