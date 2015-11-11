package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = 3;
        int arr[] = new int[n];
        int max=0;
        for (int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }
        Arrays.sort(arr);//, Collections.reverseOrder());
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " ");// = Integer.parseInt(bufferedReader.readLine());
        }
    }
}
