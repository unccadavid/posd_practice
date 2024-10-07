package deom.note;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class NoteTest {
    @Test
    public void nodecreationTest(){
        Note note=new Note();
        note.addContent(new Text("hellow world"));
        note.addContent(new Text("goodbye world"));
        assertEquals("hellow world\ngoodbye world\n", note.toString());
    }
    @Test 
    void testnodecreationwithhybridcontent(){
        Note note = new Note();
        List<Content> contents = new ArrayList<>();
        contents.add(new Text("hellow "));
        contents.add(new Text("world!"));
        Content hybrid=new HybridContent(contents);
        note.addContent(hybrid);
        note.addContent(new Text("goodbye world!"));
        assertEquals("hellow world!\ngoodbye world!\n",note.toString());
    }

}
