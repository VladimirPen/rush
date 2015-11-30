package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {

    private Solution(Object o)
    {
    }

    private Solution(Object o,Object o1)
    {
    }

    private Solution(Object o,Object o1,Object o2)
    {
    }

    public Solution(String s)
    {
    }

    public Solution(String s,String s1)
    {
    }

    public Solution(String s,String s1,String s2)
    {
    }

    protected Solution(Integer i)
    {
    }

    protected Solution(Integer i,Integer i1)
    {
    }

    protected Solution(Integer i,Integer i1,Integer i2)
    {
    }

    Solution(Double i)
    {
    }

    Solution(Double i,Double i1)
    {
    }

    Solution(Double i,Double i1,Double i2)
    {
    }
}

