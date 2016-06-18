package by.homemadeapps.Commands;

/**
 * Created by Alex on 19.06.16.
 */

import by.homemadeapps.Interface.Command;
import by.homemadeapps.Model.Movie;
import org.apache.commons.csv.writer.CSVWriter;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;


public class UpdateMovieCommand implements Command {
    private static final String PATH_TO_CSV = "E:\\MY\\CSV\\media.csv";

    @Override
    public void execute(Movie movie) throws FileNotFoundException, IOException {
        List<String[]> allElements = new ArrayList<>();
        String movieStr = movie.toString();
        String[] movData = movieStr.split(", ");

        allElements.add(movData);
        StringWriter sw = new StringWriter();
        CSVWriter writer = new CSVWriter();


    }

    @Override
    public void cancel() {

    }

    @Override
    public void name() {

    }
}