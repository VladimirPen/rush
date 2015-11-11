package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<Human> childs = new ArrayList<Human>();

        Human child1 = new Human("Vasya",false,6,childs);
        Human child2 = new Human("Kolya",false,7,childs);
        Human child3 = new Human("Nadya",true,2,childs);

        childs.add(child1);
        childs.add(child2);
        childs.add(child3);

        Human father = new Human("Vova",false,31,childs);
        Human mother = new Human("Olya",true,28,childs);

        childs.clear();
        childs.add(father);

        Human grandfather1 = new Human("Tamara",false,55,childs);
        Human grandmother1 = new Human("Gena",true,50,childs);

        childs.clear();
        childs.add(mother);

        Human grandfather2 = new Human("Alina",false,54,childs);
        Human grandmother2 = new Human("Andray",true,51,childs);

        System.out.println(grandfather1.toString());
        System.out.println(grandmother1.toString());
        System.out.println(grandfather2.toString());
        System.out.println(grandmother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());

    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        ArrayList<Human> children;

        public Human(String pName, boolean pSex, int pAge, ArrayList<Human> pChildren){
            this.name = pName;
            this.sex = pSex;
            this.age=pAge;
            this.children = new ArrayList<Human>(pChildren);
            //Collections.copy(this.children,);
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
