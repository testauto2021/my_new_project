package com.BASE;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader  {

    public static Properties prop;
    public static final String PropertyFilePath = "";
    public static final String Env="https://www.bbc.co.uk";

    public ConfigFileReader(){

        try {
            BufferedReader reader = new BufferedReader(new FileReader(PropertyFilePath));
            try {
                prop.load(reader);
                reader.close();
            } finally {

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(" NO FILE FOUND ");
        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }

}
