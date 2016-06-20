package by.homemadeapps;

import by.homemadeapps.Commands.MovieUpdate;
import by.homemadeapps.Model.Movie;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //  Constants.initProperties();
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome in Media Catalog, please enter command \nFor help type 'help'\n'add library should be first command");

        for (; ; ) {
            String c = in.nextLine();
            System.out.println(String.format("Command: %s", c));

            switch (c.toLowerCase()) {
                case "add library":
                    MovieLibruary movieLibruary = new MovieLibruary();
                case "add":
                    System.out.println("Enter movie data:\n name, author, genre, id\nseparate words with comma");
                    String movieString = in.nextLine();
                    movieString.trim();
                    List<String> movieData = Arrays.asList(movieString.split("\\s*,\\s*"));
                    String name = movieData.get(0);
                    String author = movieData.get(1);
                    String genre = movieData.get(2);
                    String id = movieData.get(3);
                    Movie movie = new Movie();
                    movie.setDirector(author);
                    movie.setGenre(genre);
                    movie.setName(name);
                    movie.setId(Integer.parseInt(id));
                    movieLibruary = new MovieLibruary(Integer.parseInt(id));
                    movieLibruary.addItemToCatalog(movie);
                    MovieUpdate updater = new MovieUpdate(movie);
                    try {
                        updater.execute();
                        System.out.println("Your item was successfully added ");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case "read":
                    System.out.println("Enter film id");
                    String idStr = in.nextLine();
                    movieLibruary = new MovieLibruary(Integer.parseInt(idStr));
                    try {
                        movieLibruary.getItemFromCatalog();
                    } catch (IOException e) {

                        System.err.print("IOException: file not  found");

                    }

                    break;
                case "read all":

                    movieLibruary = new MovieLibruary();
                    try {
                        movieLibruary.getAllData();

                    } catch (IOException e) {

                        System.err.print("IOException: file not  found");

                    }

                    break;
                case "help":
                    System.out.println("Commands: help\nadd\nread\nread all\ndelete\nexit\nEnter command\n");
                    break;
            }
            if (c.toLowerCase().equals("exit")) {
                break;
            }
        }

        in.close();
    }

}
