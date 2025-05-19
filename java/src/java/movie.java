public class Movie {
    private String title;
    private String posterUrl;

    public Movie(String title, String posterUrl) {
        this.title = title;
        this.posterUrl = posterUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nPoster: " + posterUrl + "\n";
    }
}