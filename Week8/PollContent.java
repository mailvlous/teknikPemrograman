package Week8;

import java.util.List;

public class PollContent<T> implements Content {
    private List<T> options;

    public PollContent(List<T> options) {
        this.options = options;
    }

    public void display() {
        System.out.println("Polling: ");
        for(int i = 0; i < options.size(); i++){
            System.out.println(options.get(i));
        }
    }

    public void showPollOthers() {
        display();
    }

    public void showPoll(PollContent<?> poll) {
        poll.display();
    }
}
