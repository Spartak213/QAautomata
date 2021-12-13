package com.HomeworkLesson11.Task3Instruments;

public class Tube implements Instrument{
    private int diameter;

    public Tube(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара с диаметром : " + diameter + " см.");
    }
}

