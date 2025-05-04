import com.example.chord_scalememorizer.MusicTheory;
import com.example.chord_scalememorizer.Note;
import com.example.chord_scalememorizer.Scale;
import com.example.chord_scalememorizer.Triad;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ScaleTest {
    @Test
    public void testScale(){
        Scale cMajor = MusicTheory.createMajorScale("C");

        ArrayList<Note> notesInC = cMajor.getNotes();

        for (Note i : notesInC){
            System.out.println(i.getName());
        }
        System.out.println("\n");

    }
    @Test
    public void testTriad(){
        Scale cMajor = MusicTheory.createMajorScale("C");

        Triad t = new Triad(cMajor);

        System.out.println(t.getFirst().getName());
        System.out.println(t.getThird().getName());
        System.out.println(t.getFifth().getName());
        System.out.println(t.getName());
    }
}
