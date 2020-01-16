package com.spelldictionary;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    private static String fileName = "z.csv";
    private static String newFileName = "z2.csv";

    public static void main(String[] args) {
//        createFile(fileName);
//        createFile(newFileName);
//        writeToFile(fileName, newFileName);
    }

    public static void createFile(String fileName) {
        CreateFile newFile = new CreateFile();
        newFile.makeFile(fileName);
        System.out.println(fileName);
    }

    public static void writeToFile(String oldFile, String newFile) throws IOException {

//        File outputFile = new File("output.txt");

        BufferedWriter bw = new BufferedWriter(new FileWriter(newFile));
//        // create an array list of records that I am reading from fileName
//        List<String> records = new ArrayList<>();
//        //
//        FileWriter fw = new FileWriter(newFileName);
//        PrintWriter pw = new PrintWriter(fw);
//        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
//            String line;
//
//
//        FileWriter fw = new FileWriter(newFileName);
//        PrintWriter pw = new PrintWriter(fw);
//        while (line = )
//
//
//            while ((line = br.readLine()) != null) {
//                BufferedWriter writer = new BufferedWriter(new FileWriter(newFileName));
//                String value = line;
//                pw.println(value);
//
//                if (line.length() > 4) {
////                    System.out.println(values.getClass());
//                    records.add(value);
//                    writer.newLine();
//                    writer.write(value);
//                }
//            }
////            pw.close();
//            } catch (IOException e) {
//                System.out.println("Error!");
//            }
    }
}

