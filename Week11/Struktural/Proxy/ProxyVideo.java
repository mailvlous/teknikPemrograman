

public class ProxyVideo implements Content {
    private Video video;
    private String title;
    private String userType; // "free", "premium"

    public ProxyVideo(String title, String userType) {
        this.title = title;
        this.userType = userType;
    }

    public void play() {
        if (!isAllowed()) {
            System.out.println("Access denied. Only premium users can watch this video.");
            return;
        }

        logAccess();

        if (video == null) {
            video = new Video(title); // Lazy loading
        }

        video.play();
    }

    private boolean isAllowed() {
        return userType.equals("premium");
    }

    private void logAccess() {
        System.out.println("[LOG] " + userType + " user accessed: " + title);
    }
} 
