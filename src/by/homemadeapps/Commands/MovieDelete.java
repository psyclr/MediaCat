package by.homemadeapps.Commands;

import by.homemadeapps.Interface.Command;
import by.homemadeapps.Model.Movie;

import java.io.IOException;

/**
 * Created by Alex on 19.06.16.
 */
public class MovieDelete implements Command {
    private Movie movie;

    MovieDelete(Movie movie) {
        this.movie = movie;
    }

    @Override
    public void execute() throws IOException {

    }
}
