package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human grandfather1 = new Human ("Grigory",true,70,null,null);
        Human grandfather2 = new Human ("Yevgeny",true,65,null,null);
        Human grandmother1 = new Human ("Nina",false,80,null,null);
        Human grandmother2 = new Human ("Luba",false,65,null,null);
        Human father = new Human("Gennadyi",true,57,grandfather2,grandmother2);
        Human mother = new Human("Tamara",false,50,grandfather1,grandmother1);
        Human son1 = new Human("Vladimir",true,30,father,mother);
        Human son2 = new Human("Alexey",true,21,father,mother);
        Human dauther1 = new Human("Olga",false,21,father,mother);

        System.out.println(grandfather1.toString());
        System.out.println(grandfather2.toString());
        System.out.println(grandmother1.toString());
        System.out.println(grandmother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(dauther1.toString());
    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private Integer age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, Integer age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
