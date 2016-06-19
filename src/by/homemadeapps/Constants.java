package by.homemadeapps;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Alex on 19.06.16.
 */
public abstract class Constants {
    public static String PATH_MOVIES = "movies.csv";
    private static String PATH_MUSIC = "music.csv";

    public static void initProperties() {

        Properties property = new Properties();

        try {
            property.load(new FileInputStream(new File("resources/property.ini")));
            PATH_MOVIES = property.getProperty("movies.path");
            PATH_MUSIC = property.getProperty("music.path");

        } catch (IOException e) {
            System.err.println("ОШИБКА: Файл свойств отсуствует!");
        }
    }

}
