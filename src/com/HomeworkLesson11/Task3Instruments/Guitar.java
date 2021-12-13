package com.HomeworkLesson11.Task3Instruments;

public class Guitar implements Instrument {
    private int strings;

    public Guitar(int strings) {
        this.strings = strings;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара с количеством струн : " + strings);
    }
}
