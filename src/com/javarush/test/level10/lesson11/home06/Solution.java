package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String firstName;
        String middleName;
        String lastName;
        Integer age;
        Integer weight;
        Integer height;

        public Human(String firstName)
        {
            this.firstName = firstName;
        }

        public Human(String firstName, String middleName)
        {
            this.firstName = firstName;
            this.middleName = middleName;
        }

        public Human(String firstName, String middleName, String lastName)
        {
            this.firstName = firstName;
            this.middleName = middleName;
            this.lastName = lastName;
        }

        public Human(String firstName, String middleName, String lastName, Integer age)
        {
            this.firstName = firstName;
            this.middleName = middleName;
            this.lastName = lastName;
            this.age = age;
        }

        public Human(String firstName, String lastName, Integer age)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public Human(String firstName, Integer age)
        {
            this.firstName = firstName;
            this.age = age;
        }

        public Human(String firstName, Integer age, Integer height)
        {
            this.firstName = firstName;
            this.age = age;
            this.height = height;
        }

        public Human(String firstName, String lastName, Integer weight, Integer height)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.weight = weight;
            this.height = height;
        }

        public Human(String firstName, String lastName, Integer age, Integer weight, Integer height)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        public Human(String firstName, String middleName, String lastName, Integer age, Integer weight, Integer height)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.middleName = middleName;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

    }
}
