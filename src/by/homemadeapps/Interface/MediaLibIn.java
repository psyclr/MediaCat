package by.homemadeapps.Interface;

import by.homemadeapps.Model.Movie;

import java.util.List;

/**
 * Created by Alex on 19.06.16.
 */
public interface MediaLibIn {
    public String getCatalogByName();
    public String getPathToCatalog();
    public List<Movie> getMoviesFromCatalog();
}

