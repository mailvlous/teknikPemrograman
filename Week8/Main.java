package Week8;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        YourPost fatin = new YourPost();

        Post<TextContent> textPost = new Post<>(new TextContent("Haloo"));
        Post<PollContent> pollPost = new Post<>(new PollContent<>(List.of("Benar", true, 1)));

        fatin.addPost(textPost);
        fatin.addPost(pollPost);

        fatin.showAll();

    }
}

