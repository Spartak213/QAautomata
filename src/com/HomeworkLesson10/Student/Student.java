package com.HomeworkLesson10.Student;

public class Student {
    String firstName, lastName, group;
    double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark){
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public String getScholarship(){
        if (averageMark >= 5.0){
            return "Стипендия " + firstName + " " + lastName + " равна 100 уе";
        }
        return "Стипендия " + firstName + " " + lastName + " равна 80 уе";
    }
}
