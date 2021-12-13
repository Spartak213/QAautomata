package com.HomeworkLesson10.Animal;

public class Cat extends  Animal{

    public Cat(String name, String food, String location) {
        super(name, food, location);
    }
    public void makeNoise(){
        System.out.println("мяу-мяу");
    }
    public void eat(){
        System.out.println("вы рыбов продаете?");
    }
}
