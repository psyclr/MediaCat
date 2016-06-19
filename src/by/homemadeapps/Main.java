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
        //  Constants.initProperties();
        Scanner in = new Scanner(System.in);

        for (; ; ) {
            String c = in.nextLine();
            System.out.println(String.format("Command: %s", c));

            switch (c) {

                case "add":
                    System.out.println("Enter movie data: name, author, genre+\n");
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

                    MovieUpdate updater = new MovieUpdate(movie);
                    try {
                        updater.execute();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case "read":
                    System.out.println("Enter film id");
                    String id = in.nextLine();

                    MovieRead reader = new MovieRead(Integer.parseInt(id));
                    try {
                        reader.execute();
                    } catch (IOException e) {
                        System.err.print("IOException: file not  found");
                    }
                    break;
                case "read all":
                    break;
            }


            if (c.toLowerCase().equals("exit")) {
                break;
            }
        }

        in.close();
    }

}
