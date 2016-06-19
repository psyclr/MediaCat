package by.homemadeapps.Commands;

import by.homemadeapps.Model.Movie;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by Alex on 19.06.16.
 */
class CsvServise {

    static void writeCsvFile(Movie movie) throws IOException {
        File file = new File("E:\\MY\\CSV\\media.csv");
        FileUtils.write(file, movie.toString());
    }


    public static List readCsvFile() throws IOException {
        File file = new File("E:\\MY\\CSV\\media.csv");
        List lines = FileUtils.readLines(file, "UTF-8");
        return lines;
    }
}




