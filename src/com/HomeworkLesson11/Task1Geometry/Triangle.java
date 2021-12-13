package com.HomeworkLesson11.Task1Geometry;

public class Triangle implements Figure {

    public void getPerimeter(){
        int x = a + b + c;
        System.out.println("Периметр треугольника равен: " + x + " метра");
    }
}
