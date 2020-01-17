package DataManipuation;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MappingDictionaryNames {

            public static void main(String[] args) throws IOException {
                DictionaryNames dictionaryNames = new DictionaryNames();
//                1. Read the files
                // this is the pattern to create the new files
                // consider moving to its own method
//                List<String> originalFilePath = DictionaryNames.generateOriginalFileNames();
//                originalFilePath.forEach(path -> newMap.makeFile(path));

                // first iteration- three char words get filtered
//
//                List<String> originalFiles = DictionaryNames.generateOriginalFileNames();
//                List<String> newFilesFilteredThree = DictionaryNames.generateNamesForThreeCharWordsFiltered();
//                // this generates the file
//                for (String element : newFilesFilteredThree) {
//                    dictionaryNames.makeFile(element);
//                }

//                List<String> newFilesFilteredThreeAndSeven = DictionaryNames.generateNamesForFilteredToSevenUniqueCharMax();

// ************** come back here

                // read the originalFiles
                // write to the newFilesFilteredThree, only if string length is greater than three characters long
//                int i = 0;
//                for (String fileName: originalFiles) {
                    File fileName = new File("../EOWL-v1.1.2/CSV Format/A Words.csv");
                    File writeFile = new File("new_a.csv");
                    BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
                    OutputStream outStream = new FileOutputStream(writeFile);
                    String line = reader.readLine();
                    outStream.write(line.getBytes());
                        while(line != null){
                            line = reader.readLine();
                            outStream.write(line.getBytes());
                        }
                reader.close();
                outStream.close();

//                    i += 1;
//                }
          }
        }
