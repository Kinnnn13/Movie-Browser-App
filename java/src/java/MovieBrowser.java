import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieBrowser {
    private static List<Movie> movies = new ArrayList<>();

    public static void main(String[] args) {
        initializeMovies();
        Scanner scanner = new Scanner(System.in);

        System.out.println("🎬 Welcome to the Movie Browser!");
        while (true) {
            System.out.print("\nEnter a movie title to search (or 'exit' to quit): ");
            String query = scanner.nextLine().trim().toLowerCase();

            if (query.equals("exit")) {
                System.out.println("Goodbye!");
                break;
            }

            List<Movie> results = searchMovies(query);

            if (results.isEmpty()) {
                System.out.println("No movies found matching \"" + query + "\".");
            } else {
                System.out.println("Results:");
                for (Movie movie : results) {
                    System.out.println(movie);
                }
            }
        }

        scanner.close();
    }

    private static void initializeMovies() {
        movies.add(new Movie("Interstellar", "https://image.tmdb.org/t/p/w300//gEU2QniE6E77NI6lCU6MxlNBvIx.jpg"));
        movies.add(new Movie("The Dark Knight", "https://image.tmdb.org/t/p/w300//1hRoyzDtpgMU7Dz4JF22RANzQO7.jpg"));
        movies.add(new Movie("Tenet", "https://image.tmdb.org/t/p/w300//k68nPLbIST6NP96JmTxmZijEvCA.jpg"));
        movies.add(new Movie("Avatar", "https://image.tmdb.org/t/p/w300//6EiRUJpuoeQPghrs3YNktfnqOVh.jpg"));
    }

    private static List<Movie> searchMovies(String query) {
        List<Movie> results = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getTitle().toLowerCase().contains(query)) {
                results.add(movie);
            }
        }
        return results;
    }
}