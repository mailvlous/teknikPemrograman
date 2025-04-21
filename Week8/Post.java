package Week8;

public class Post<T extends Content> {
    private T content;

    public Post(T content){
        this.content = content;
    }

    public void ShowPost() {
        content.display();
    }

    public void showPoll(PollContent<?> poll) {
        poll.display();
    }
    
}
