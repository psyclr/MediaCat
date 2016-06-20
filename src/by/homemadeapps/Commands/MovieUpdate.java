package by.homemadeapps.Commands;

/**
 * Created by Alex on 19.06.16.
 */

import by.homemadeapps.Data.Constants;
import by.homemadeapps.Interface.Command;
import by.homemadeapps.Model.Movie;

import java.io.IOException;


public class MovieUpdate implements Command {
    private Movie movie;

    public MovieUpdate(Movie movie) {
        this.movie = movie;
    }

     @Override
    public void execute() throws IOException {
         CsvServise.writeCsvFile(movie, Constants.PATH_MOVIES);
    }


}
