package hello;

public class Greeting {
    
    private String content;
    private String content2;

     public Greeting(String content,String content2) {
         this.content = content;
         this.content2 = content2;
     }

    public String getContent() {
        return content;
    }

    public String getContent2() {
        return content2;
    }
}
