package by.homemadeapps.Data;

import by.homemadeapps.Commands.CsvServise;
import by.homemadeapps.Interface.Command;
import by.homemadeapps.Model.Movie;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Alex on 19.06.16.
 */
public class MovieRead implements Command {

    private int id;

    List<String> movieData;
    String s;

    MovieRead(int id) {
        this.id = id;
    }

    public MovieRead() {

    }


    @Override
    public void execute() throws IOException {
        List data = CsvServise.readCsvFile(Constants.PATH_MOVIES);
        for (int i = 0; i < data.size(); i++) {
            s = (String) data.get(i);
            if (s != null) {
                movieData = Arrays.asList(s.split("\\s*,\\s*"));
                Movie movie = new Movie();
                movie.setId(Integer.parseInt(movieData.get(0)));
                movie.setName(movieData.get(1));
                movie.setGenre(movieData.get(2));
                movie.setDirector(movieData.get(3));

                if (Integer.parseInt(movieData.get(0)) == id) {
                    System.out.println("Your movie data: " + movie.toString());
                    break;
                }
            }
        }
    }
}
