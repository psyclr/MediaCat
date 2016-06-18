package by.homemadeapps.Interface;

import by.homemadeapps.Model.Movie;

import java.io.IOException;
import java.util.List;

/**
 * Created by Alex on 19.06.16.
 */
public interface MovieIn {
    public List<Movie> getMovieByPath(String path)throws IOException;
    public void updateMovie() throws IOException;
    public List<Movie> getAllMovies()throws IOException;
}
