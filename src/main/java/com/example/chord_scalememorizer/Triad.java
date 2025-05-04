package com.example.chord_scalememorizer;

import java.util.ArrayList;

public class Triad {
    private Note first;
    private Note third;
    private Note fifth;
    private String name;

    public Triad(Scale scale){
        ArrayList<Note> scaleNotes = scale.getNotes();

        this.first = scaleNotes.get(0);
        this.third = scaleNotes.get(2);
        this.fifth = scaleNotes.get(4);

        this.name = scale.getName() + " Triad";
    }

    public String getName() {
        return name;
    }

    public Note getFirst() {
        return first;
    }

    public Note getThird() {
        return third;
    }

    public Note getFifth() {
        return fifth;
    }
}
