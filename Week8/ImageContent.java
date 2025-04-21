package Week8;

public class ImageContent implements Content {
    private String imageUrl;

    public ImageContent(String url) {
        this.imageUrl = url;
    }

    public void display() {
        System.out.println(imageUrl);
    }
}
