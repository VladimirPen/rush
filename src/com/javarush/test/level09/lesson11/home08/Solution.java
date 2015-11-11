package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;
import java.util.List;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        ArrayList<int[]> res = new ArrayList<int[]>();
        int[] arr = {1,2,3,4,5};
        res.add(arr);
        int[] arr1 = {1,2};
        res.add(arr1);
        int[] arr2 = {1,2,3,4};
        res.add(arr2);
        int[] arr3 = {1,2,3,4,5,6,7};
        res.add(arr3);
        int[] arr4 = {};
        res.add(arr4);
        return res;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
