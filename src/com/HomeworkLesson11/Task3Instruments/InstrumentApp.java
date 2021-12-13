package com.HomeworkLesson11.Task3Instruments;

public class InstrumentApp {
    public static void main(String[] args) {
        Instrument guitar = new Guitar(6);
        Instrument drums = new Drums(20);
        Instrument tube = new Tube(15);

        Instrument[] instruments = {guitar,drums,tube};

        for (Instrument i : instruments){
            i.play();
        }
    }
}
