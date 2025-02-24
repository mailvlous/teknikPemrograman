public class Film {
    private String judul;
    private String genre;
    private String rating;
    private String durasi;


    public Film(String judul, String genre, String rating, String durasi) {
        this.judul = judul;
        this.genre = genre;
        this.rating = rating;
        this.durasi = durasi;
    }

    // setter
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setDurasi(String durasi) {
        this.durasi = durasi;
    }

    // getter
    public String getJudul() {
        return judul;
    }

    public String getGenre() {
        return genre;
    }

    public String getRating() {
        return rating;
    }

    public String getDurasi() {
        return durasi;
    }

}
