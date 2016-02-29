package de.meyer.mediadatabase.resources;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * Created by thufir on 29.02.16.
 */
public class Messages {
    private static Messages ourInstance = new Messages();
    private ResourceBundle rb;

    public static Messages getInstance() {
        return ourInstance;
    }

    private Messages() {
        rb = ResourceBundle.getBundle("de.meyer.mediadatabase.resources.GuiOutput");
    }

    public String getString(String key) {

        return this.rb.getString(key);
    }
}
