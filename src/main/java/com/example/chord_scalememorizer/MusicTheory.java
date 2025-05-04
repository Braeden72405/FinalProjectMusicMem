package com.example.chord_scalememorizer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MusicTheory {
    private static final String[] Notes =
            {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"}; //array of every note



    public static Scale createMajorScale(String rootNote) {
        int[] pattern = {2, 2, 1, 2, 2, 2, 1}; //pattern for major scale
        return new Scale(createScale(rootNote, pattern), rootNote + " Major");
    }

    public static Scale createMinorScale(String rootNote) {
        int[] pattern = {2, 1, 2, 2, 1, 2, 2}; //pattern for minor scale
        return new Scale(createScale(rootNote, pattern), rootNote + " Minor");
    }


    /**
     * function for applying pattern to array of notes
     *
     */
    private static ArrayList<Note> createScale(String rootNote, int[] pattern) {
        ArrayList<Note> scale = new ArrayList<>();

        int index = Arrays.asList(Notes).indexOf(rootNote);

        if (index == -1) {
            throw new IllegalArgumentException("Invalid root note: " + rootNote);
        }

        scale.add(new Note(rootNote));

        for (int step : pattern) {
            index = (index + step) % 12;
            scale.add(new Note(Notes[index]));
        }

        return scale;
    }
}
