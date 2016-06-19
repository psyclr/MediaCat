package by.homemadeapps;

/**
 * Created by Alex on 19.06.16.
 */

import by.homemadeapps.Interface.IMediaLib;
import by.homemadeapps.Model.MediaItem;

import java.util.ArrayList;
import java.util.List;

public class MovieLibruary implements IMediaLib {
    private String pathToCatalog;
    private List<MediaItem> mediaItems = new ArrayList<>();
    private String catalogName;




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
    public List<MediaItem> getItemsFromCatalog() {
        return mediaItems;
    }

    @Override
    public void addItemToCatalog(MediaItem movie) {
        mediaItems.add(movie);
    }



}
