package DataManipuation;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MappingDictionaryNames {

            public static void main(String[] args) throws IOException {
                MappingDictionaryNames newMap = new MappingDictionaryNames();
                //create file you are writing to
                // for
                List<String> originalFilePath = DictionaryNames.generateOriginalFileNames();
                originalFilePath.forEach(path -> newMap.makeFile(path));

//                // 1. read the file
//                // read input
//                BufferedReader reader = new BufferedReader( new InputStreamReader(new FileInputStream("a_words.csv")));
//                // write to output
//                OutputStream outStream = new FileOutputStream(path);
//                String line = reader.readLine();
//                List<String> dictionary = new ArrayList<>();
//                while(line != null){
//                    dictionary.add(line);
//                    dictionary.add(line.getClass().toString());
//                    line = reader.readLine();
//                }
//                // here I would write to DB with the line of A words
//                System.out.println(dictionary);
//                reader.close();
//                outStream.close();
//
//
//                System.out.println("done writing to " +path);
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
