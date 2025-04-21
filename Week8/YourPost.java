package Week8;

import java.util.ArrayList;
import java.util.List;

public class YourPost {
    private List<Post<?>> posts = new ArrayList<>();


    public void addPost(Post<?> post) {
        posts.add(post);
    }

    public void showAll() {
        for (Post<?> post : posts) {
            post.ShowPost();
        }
    }
}
