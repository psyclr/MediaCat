package by.homemadeapps.Model;

/**
 * Created by Alex on 19.06.16.
 */

public class Movie {


    private int id;
    private String genre;
    private String author;
    private String name;

    public Movie(){
        this.id=0;
        this.genre="";
        this.author="";
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", genre='" + genre + '\'' +
                ", author='" + author + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
