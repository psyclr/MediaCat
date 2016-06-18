package by.homemadeapps;

/**
 * Created by Alex on 19.06.16.
 */

import by.homemadeapps.Interface.MediaLibIn;
import by.homemadeapps.Model.Movie;


import java.util.ArrayList;
import java.util.List;

public abstract class MediaLibruary implements MediaLibIn {
    private String pathToCatalog;
    private List<Movie> booksInLibraryList = new ArrayList<Movie>();
    private String catalogName;

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public void setPathToCatalog(String pathToCatalog) {
        this.pathToCatalog = pathToCatalog;
    }

    public void setBooksInLibraryList(List<Movie> booksInLibraryList) {
        this.booksInLibraryList = booksInLibraryList;
    }

    @Override
    public String getCatalogByName() {
        return catalogName;
    }

    @Override
    public String getPathToCatalog() {
        return pathToCatalog;
    }

    @Override
    public List<Movie> getMoviesFromCatalog() {
        return booksInLibraryList;
    }

}
