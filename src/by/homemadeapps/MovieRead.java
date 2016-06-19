package by.homemadeapps;

import by.homemadeapps.Commands.CsvServise;
import by.homemadeapps.Interface.Command;
import by.homemadeapps.Model.Movie;

import java.io.IOException;
import java.util.List;

/**
 * Created by Alex on 19.06.16.
 */
public class MovieRead implements Command {

    private int id;

    MovieRead(int id) {
        this.id = id;
    }


    @Override
    public void execute() throws IOException {
        List data = CsvServise.readCsvFile(Constants.PATH_MOVIES);
        for (int i = 0; i < data.size(); i++) {
            Movie movie = (Movie) data.get(i);
            if (movie.getId() == id){
                System.out.println(movie.toString());
            }else{
                System.out.println("there's no such item in the library");

            }
        }


    }
}
