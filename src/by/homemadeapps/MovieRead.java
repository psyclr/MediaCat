package by.homemadeapps;

import by.homemadeapps.Commands.CsvServise;
import by.homemadeapps.Interface.Command;
import by.homemadeapps.Model.Movie;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Alex on 19.06.16.
 */
public class MovieRead implements Command {

    private int id;
    Movie movie;

    MovieRead(int id) {
        this.id = id;
    }


    @Override
    public void execute() throws IOException {
        List data = CsvServise.readCsvFile(Constants.PATH_MOVIES);
        for (int i = 0; i < data.size(); i++) {
            String s = (String) data.get(i);
            List<String> movieData = Arrays.asList(s.split("\\s*,\\s*"));

            if (Integer.parseInt(movieData.get(0)) == id) {

                break;
            } else {
                System.out.println("there's no such item in the library");
            }
        }


    }
}
