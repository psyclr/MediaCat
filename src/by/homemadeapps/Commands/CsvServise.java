package by.homemadeapps.Commands;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by Alex on 19.06.16.
 */
class CsvServise {

    public static <T> void writeCsvFile(T type, String path) throws IOException {
        File file = new File(path);
        FileUtils.writeStringToFile(file, type.toString()+"\n", true);
    }


    public static List readCsvFile(String path) throws IOException {
        File file = new File(path);
        List lines = FileUtils.readLines(file, "UTF-8");
        return lines;
    }
}




