

class Video implements Content {
    private String title;

    public Video(String title) {
        this.title = title;
        loadFromServer();
    }

    private void loadFromServer() {
        System.out.println("Streaming video '" + title + "' from server...");
    }

    public void play() {
        System.out.println("Playing video: " + title);
    }
}
