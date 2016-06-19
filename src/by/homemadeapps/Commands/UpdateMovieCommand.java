package by.homemadeapps.Commands;

/**
 * Created by Alex on 19.06.16.
 */

import by.homemadeapps.Interface.Command;
import by.homemadeapps.Model.Movie;

import java.io.IOException;


public class UpdateMovieCommand implements Command {
    private static final String PATH_TO_CSV = "E:\\MY\\CSV\\media.csv";

    @Override
    public void execute(Movie movie) throws IOException {
        CsvServise.writeCsvFile(movie);

    }

    @Override
    public void cancel() {

    }

    @Override
    public void name() {

    }
}