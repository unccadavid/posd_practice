package deom.note;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ar.com.hjg.pngj.PngReader;

import org.junit.jupiter.api.Test;

public class ContentTest {
    @Test
    void Testtextcreation(){
        Content content=new Text("hellow world");
        assertEquals("hellow world", content.toString());
    }
    @Test
    void testhybridcontent(){
        Content text1 = new Text("hellow");
        Content text2 = new Text(" world!");
        List<Content> contents=new ArrayList<>();
        contents.add(text1);
        contents.add(text2);
        Content hybridcontent =new HybridContent(contents);
        assertEquals("hellow world!", hybridcontent.toString());
    }
    @Test
    void testaccesscontentofhybridcontent(){
        Content text1 = new Text("hellow");
        Content text2 = new Text(" world!");
        List<Content> contents=new ArrayList<>();
        contents.add(text1);
        contents.add(text2);
        HybridContent hybridcontent =new HybridContent(contents);
        Iterator<Content> iterator=hybridcontent.iterator();
        assertEquals("hellow", iterator.next().toString());
        assertEquals(" world!", iterator.next().toString());
    }
    @Test 
    public void testtextreturn(){
        Content text= new Text("hellow world!");
        Iterator<Content> iterator = text.iterator();
        assertEquals(null, iterator);
    }
    @Test
    public void testreadblueimg() throws IOException{
        FileInputStream fileinputitream = new FileInputStream(new File("blue.png"));
        PngReader pngreader = new PngReader(fileinputitream);
    }
}
