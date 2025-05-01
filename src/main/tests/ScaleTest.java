import com.example.chord_scalememorizer.MusicTheory;
import com.example.chord_scalememorizer.Note;
import com.example.chord_scalememorizer.Scale;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ScaleTest {
    @Test
    public void testScale(){
        Scale cMajor = MusicTheory.createMajorScale("D#");

        ArrayList<Note> notesInC = cMajor.getNotes();

        for (Note i : notesInC){
            System.out.println(i.getName());
        }


    }
}
