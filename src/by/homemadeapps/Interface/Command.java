package by.homemadeapps.Interface;

/**
 * Created by Alex on 19.06.16.
 */

import by.homemadeapps.Model.Movie;

import java.io.IOException;



public interface Command {
    void execute(Movie movie) throws IOException;
    void cancel();
    void name();
}

