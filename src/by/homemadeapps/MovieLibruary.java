package by.homemadeapps;

/**
 * Created by Alex on 19.06.16.
 */

import by.homemadeapps.Commands.MovieReadAll;
import by.homemadeapps.Interface.IMediaLib;
import by.homemadeapps.Model.MediaItem;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MovieLibruary implements IMediaLib {
    private int idForUse;
    private String pathToCatalog;
    private List<MediaItem> mediaItems = new ArrayList<>();
    private String catalogName;

    MovieLibruary(int id) {
        idForUse = id;
    }

    public MovieLibruary() {

    }


    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public void setPathToCatalog(String pathToCatalog) {
        this.pathToCatalog = pathToCatalog;
    }

    public void setMediaItems(List<MediaItem> mediaItems) {
        this.mediaItems = mediaItems;
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
    public void getItemFromCatalog() throws IOException {
        MovieRead movieRead = new MovieRead(idForUse);
        movieRead.execute();

    }

    @Override
    public void getAllData() throws IOException {
        MovieReadAll movieReadAll = new MovieReadAll();
        movieReadAll.execute();
    }

    @Override
    public void addItemToCatalog(MediaItem movie) {
        mediaItems.add(movie);

    }


}
