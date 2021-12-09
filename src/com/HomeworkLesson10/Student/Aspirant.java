package com.HomeworkLesson10.Student;

public class Aspirant extends Student{
    String scienceWork;
    public Aspirant(String firstName, String lastName, String group, double averageMark, String scienceWork){
        super (firstName, lastName, group, averageMark);
        this.scienceWork = scienceWork;
    }
    public String getScholarship(){
        if (averageMark >= 5.0){
            return "Стипендия " + firstName + " " + lastName + " равна 200 уе";
        }
        return "Стипендия " + firstName + " " + lastName + " равна 180 уе";
    }
    public static void Students(Student[] student){
        System.out.println("Стипендии ");
        for (Student students : student){
            System.out.println(students.getScholarship());
        }
    }
    public static void main(String[] args) {
        Student student = new Student("Alex", "Cordoba", "7a", 4.4);
        Aspirant aspirant = new Aspirant("Trent", "Lactoza", "7b",5.0,"Humanism");
        Student[] students = {student, aspirant};
        Students(students);
    }
}
