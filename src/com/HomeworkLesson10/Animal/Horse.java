package com.HomeworkLesson10.Animal;

public class Horse extends Animal{

    public void makeNoise(){
        System.out.println("Геральт ты де");
    }
    public void eat(){
        System.out.println("морковку гони, а то в текстурах застряну");
    }

    public Horse(String name, String food, String location) {
        super(name, food, location);
    }
}
