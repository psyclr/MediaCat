package by.homemadeapps;

import by.homemadeapps.Commands.MovieUpdate;
import by.homemadeapps.Model.Movie;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    static int counter;

    public static void main(String[] args) {
        Constants.initProperties();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter movie data: name, author, genre");
        String movieString = in.nextLine();
        movieString.trim();
        List<String> movieData = Arrays.asList(movieString.split("\\s*,\\s*"));
        String name = movieData.get(0);
        String author = movieData.get(1);
        String genre = movieData.get(2);
        Movie movie = new Movie();
        counter++;
        movie.setDirector(author);
        movie.setGenre(genre);
        movie.setName(name);
        movie.setId(counter);
        System.out.print("press 1 for saving movie to library, \n2 for delete movie from movie library, \n3 for exit");

        int s = in.nextInt();
        switch (s) {

            case 1:
                MovieUpdate updater = new MovieUpdate(movie);
                try {
                    updater.execute();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            case 2:


            case 3:
                break;
        }
        in.close();
    }

}
