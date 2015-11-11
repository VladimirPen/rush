package com.javarush.test.level05.lesson07.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше методов initialize(…)
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

    public void initialize(int width, int height, int top, int left){
        this.width = width;
        this.height = height;
        this.top = top;
        this.left = left;
    }

    public void initialize(int width, int top, int left){
        this.width = width;
        this.height = this.width;
        this.top = top;
        this.left = left;
    }

    public void initialize(Rectangle rec){
        this.width = rec.width;
        this.height = rec.height;
        this.top = rec.top;
        this.left = rec.left;
    }

    public void initialize(int top, int left){
        this.width = 0;
        this.height = 0;
        this.top = top;
        this.left = left;
    }



}
