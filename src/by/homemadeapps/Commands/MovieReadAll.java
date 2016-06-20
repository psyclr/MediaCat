package by.homemadeapps.Commands;

/**
 * Created by Alex on 20.06.16.
 */

import by.homemadeapps.Constants;
import by.homemadeapps.Interface.Command;
import by.homemadeapps.Model.Movie;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Alex on 19.06.16.
 */
public class MovieReadAll implements Command {

    List<String> movieData;
    String s;

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
                System.out.println("Your movie data: " + movie.toString() + "\n");

            }
        }
    }
}

