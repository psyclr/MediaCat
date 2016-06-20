package by.homemadeapps.Model;

/**
 * Created by Alex on 19.06.16.
 */

public class Movie extends MediaItem{
    private int id;
    private String name;
    private String genre;
    private String director;


    public Movie(){
        this.id=0;
        this.genre="";
        this.director ="";
        this.name="";
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return id+","+name+","+genre+","+director;
    }
}
