package com.spelldictionary;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static String FILE_NAME = "dictionary2.txt";
    public static void main(String[] args) {
        try {
            File dictionary = new File(FILE_NAME);
            if (dictionary.createNewFile()) {
                System.out.println("file created: " + dictionary.getName());
            } else {System.out.println("File already exists.");}
        } catch (IOException e) {
            System.out.println("error" + e);
        }

    }

}
