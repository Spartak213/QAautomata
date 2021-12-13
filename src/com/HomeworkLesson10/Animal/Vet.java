package com.HomeworkLesson10.Animal;

public class Vet extends Animal {

    public Vet(String name, String food, String location) {
        super(name, food, location);
    }

    public static void treatAnimal(Animal[] animal){
        System.out.println("Список животных: ");
        for (Animal animals : animal){
            System.out.println(animals.getInfo());
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Lucifer", "Bone", "Hell");
        Cat cat = new Cat("Rosie", "Mouse", "Carpet");
        Horse horse = new Horse("Plotva", "Herb", "Field");
        Animal[] animals = {cat, dog, horse};
        treatAnimal(animals);
    }
}
