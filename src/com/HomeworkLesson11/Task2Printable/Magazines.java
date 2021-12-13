package com.HomeworkLesson11.Task2Printable;

public class Magazines implements Printable{
    private String name;

    public Magazines(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Printable book1 = new Magazines("За рулем");
        Printable book2 = new Magazines("Playboy");
        Printable[] printables = {book1, book2};
        printMagazines(printables);
    }

    public static void printMagazines(Printable[] printables){
        for (Printable printable : printables) {
            if (printable instanceof Magazines){
                printable.print();
            }
        }
    }

    public void print() {
        System.out.println("Список журналов: " + getName());
    }
}
