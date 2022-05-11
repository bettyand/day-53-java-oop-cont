import java.util.ArrayList;
import java.util.Scanner;

public class TvShowApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        ArrayList<TvShow> tvShows = new ArrayList<>();
        System.out.println("Let's make a list of your favorite TV shows!");
        System.out.println("Enter an empty line when you want to stop.");

        int numShows = 0;
        while (true) {
            System.out.println("What is the name of the show?");
            String showName = in.nextLine();
            if (showName == "") {
                break;
            }

            System.out.println("How many episodes does it have?");
            int numEpisodes = Integer.parseInt(in.nextLine());
            
            System.out.println("What is the genre?");
            String genre = in.nextLine();

            tvShows.add(new TvShow(showName, numEpisodes, genre));
            numShows++;
        }

        System.out.println("Here is the list of shows you entered:");

        for (TvShow show : tvShows) {
            System.out.println(show);
        }

        System.out.println("Please pause to consider your taste...");
        int i = 0;
        while (i < numShows) {
            System.out.println("...");
            i++;
        }
        System.out.println("Enough dilly-dallying, back to grading!");

        in.close();
    }
}
