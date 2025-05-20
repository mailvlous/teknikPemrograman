
public class Main {
    public static void main(String[] args) {
        Content freeUserVideo = new ProxyVideo("Interstellar", "free");
        Content premiumUserVideo = new ProxyVideo("Inception", "premium");

        freeUserVideo.play();     // Access denied
        System.out.println();
        premiumUserVideo.play();  // Logged + Loaded + Played
        premiumUserVideo.play();  // Logged + Played (tidak load ulang)
        
    }
}
