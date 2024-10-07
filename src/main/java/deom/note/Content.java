package deom.note;

import java.util.Iterator;

public interface Content {
    default Iterator<Content> iterator(){
        return null;
    }
}
