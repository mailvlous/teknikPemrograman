package Week8;

public class TextContent implements Content{
    private String text;

    public TextContent(String text) {
        this.text = text;
    }

    @Override
    public void display() {
        System.out.println("POst: "+ text);
    }
}
