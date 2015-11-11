package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man man1 = new Man("Tom",35, "Avenue 35, 79");
        Man man2 = new Man("Tim",5, "Avenue 34, 72");

        System.out.println(man1.toString());
        System.out.println(man2.toString());

        Woman woman1 = new Woman("Jay", 28, "Avenue 45, 243");
        Woman woman2 = new Woman("July", 21, "Avenue 74, 34");

        System.out.println(woman1.toString());
        System.out.println(woman2.toString());
        // Выведи их на экран тут
    }

    public static class Man{

        String name;
        int age;
        String address;

        public Man (String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;;
        }

        public String toString() {
            return this.name + " " + this.age + " " + this.address;
        }
    }

    public static class Woman{

        String name;
        int age;
        String address;

        public Woman (String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;;
        }

        public String toString() {
            return this.name + " " + this.age + " " + this.address;
        }
    }
}
