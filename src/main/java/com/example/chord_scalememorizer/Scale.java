package com.example.chord_scalememorizer;

import java.util.ArrayList;

public class Scale {
    private String name;
    private ArrayList<Note> notes;

    public Scale(ArrayList<Note> notes, String name){
        this.notes = notes;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public ArrayList<Note> getNotes() {
        return notes;
    }
}
