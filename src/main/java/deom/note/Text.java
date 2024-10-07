package deom.note;

public class Text implements Content{
    private String content;
    public Text(String content){
        this.content=content;
    }
    @Override
    public String toString(){
        return content;
    }
}
