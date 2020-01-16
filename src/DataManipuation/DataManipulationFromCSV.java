package DataManipuation;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataManipulationFromCSV {

            public static void main(String[] args) throws IOException {
                //create file you are writing to
                File path = new File("a2_words.csv");
                System.out.println("We got a file " + path);
                System.out.println("Does it exist?" + path.exists());
                System.out.println("wat?" + path.isDirectory());

                // 1. read the file
                // read input
                BufferedReader reader = new BufferedReader( new InputStreamReader(new FileInputStream("a_words.csv")));
                // write to output
                OutputStream outStream = new FileOutputStream(path);
                String line = reader.readLine();
                List<String> dictionary = new ArrayList<>();
                while(line != null){
                    dictionary.add(line);
                    dictionary.add(line.getClass().toString());
                    line = reader.readLine();
                }
                // here I would write to DB with the line of A words
                System.out.println(dictionary);
                reader.close();
                outStream.close();


                System.out.println("done writing to " +path);
            }
        }
