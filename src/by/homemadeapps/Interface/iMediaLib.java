package by.homemadeapps.Interface;

import by.homemadeapps.Model.MediaItem;

import java.util.List;

/**
 * Created by Alex on 19.06.16.
 */
public interface IMediaLib {
    public String getCatalogByName();
    public String getPathToCatalog();
    public List<MediaItem> getItemsFromCatalog();
    public void addItemToCatalog(MediaItem mediaItem);
}

