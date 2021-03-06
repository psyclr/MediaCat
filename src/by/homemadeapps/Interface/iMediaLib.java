package by.homemadeapps.Interface;

import by.homemadeapps.Model.MediaItem;

import java.io.IOException;

/**
 * Created by Alex on 19.06.16.
 */
public interface IMediaLib {
    public String getCatalogByName();

    public String getPathToCatalog();

    public void getItemFromCatalog() throws IOException;

    public void getAllData() throws IOException;

    public void addItemToCatalog(MediaItem mediaItem);

}

