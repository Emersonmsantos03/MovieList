import java.util.ArrayList;
public class MovieListTest {
    public static void main(String[] args) {

        String movie1 = "Maze Runner";
        String movie2 = "Avengers Ifinity War";
        String movie3 = "Avengers End Game";
        String movie4 = "Pacific Rim";
        String movie5 = "Um contratempo";
        String movie6 = "Onde está segunda?";
        String movie7 = "The mother";

        ArrayList<String> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);
        movies.add(movie6);
        movies.add(movie7);

        movies.remove(0);

        for(String movie : movies){
            System.out.println("Recommended movie: " + movie);
        }


    }






}
