package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[4];
        int max=0;
        for (int i=0;i<4;i++){
            arr[i] = Integer.parseInt(bufferedReader.readLine());
            if (i==0){
                max = arr[i];
            }
            else{
                if (max<arr[i]){
                    max = arr[i];
                }
            }

        }
        System.out.print(max);
    }
}
