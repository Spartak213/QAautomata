package com.HomeworkLesson10.Animal;

public class Dog extends Animal {

    public void makeNoise(){
        System.out.println("гав гав");
    }
    public void eat(){
        System.out.println("подайте кость на пропитание");
    }

    public Dog(String name, String food, String location) {
        super(name, food, location);
    }
}
