package com.HomeworkLesson11.Task3Instruments;

public class Drums implements Instrument{
    private int size;

    public Drums(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Играт барабаны с размером : " + size);
    }
}
