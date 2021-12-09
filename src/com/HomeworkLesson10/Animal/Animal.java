package com.HomeworkLesson10.Animal;

public class Animal {
    public String name;
    public String food;
    public String location;

    public Animal(String name, String food, String location) {
        this.name = name;
        this.food = food;
        this.location = location;
    }
    public static void main(String[] args) {
        Cat cat = new Cat("Рози","рыбка","одеялко");
        cat.makeNoise();
        cat.eat();
        Dog dog = new Dog("Шарик","кость","будка");
        dog.makeNoise();
        dog.eat();
    }


    public void makeNoise(){
        System.out.println("Такое животное спит: " + name);
    }
    public void eat(){
        System.out.println(name +  " ест " + food);
    }

    public String getInfo() {
        return "Имя: " + name  + ", еда: " + food  + ", локация: " + location;
    }
}
