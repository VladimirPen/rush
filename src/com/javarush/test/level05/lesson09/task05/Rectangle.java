package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    int top;
    int left;
    int width;
    int height;

    public Rectangle(int width, int height, int top, int left){
        this.width = width;
        this.height = height;
        this.top = top;
        this.left = left;
    }

    public Rectangle(int width, int top, int left){
        this.width = width;
        this.height = this.width;
        this.top = top;
        this.left = left;
    }

    public Rectangle(Rectangle rec){
        this.width = rec.width;
        this.height = rec.height;
        this.top = rec.top;
        this.left = rec.left;
    }

    public Rectangle(int top, int left){
        this.width = 0;
        this.height = 0;
        this.top = top;
        this.left = left;
    }



}