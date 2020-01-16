package com.spelldictionary;

import java.io.File;
import java.io.IOException;

public class CreateFile {

    private String fileName;

    public void createFile(String fileName){

    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void makeFile(String fileName){
        try {
            File dictionary;
            dictionary = new File(fileName);
            if (dictionary.createNewFile()) {
                System.out.println("file created: " + dictionary.getName());
            } else {System.out.println("File already exists.");}
        } catch (IOException e) {
            System.out.println("error" + e);
        }
    }

}
