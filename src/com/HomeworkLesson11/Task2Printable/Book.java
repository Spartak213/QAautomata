package com.HomeworkLesson11.Task2Printable;

public class Book implements Printable{
    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    

    public static void main(String[] args) {
        Printable book1 = new Book("10 негритят", "A.Кристи");
        Printable book2 = new Book("1984", "Дж.Оруелл");
        Printable[] printables = {book1, book2};
        printBooks(printables);
    }

    public static void printBooks(Printable[] printables){
        for (Printable printable : printables) {
            if (printable instanceof Book){
                printable.print();
            }
        }
    }

    public void print() {
        System.out.println("Список книг: " + getName() + " " + getAuthor());
    }
}
