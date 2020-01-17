package DataManipuation;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DictionaryNames {

    public static void main(String[] args) {
        List<String> originalFileNames = generateOriginalFileNames();
//        System.out.println(originalFileNames);
        List<String> firstFilterFileNames =  generateNamesForThreeCharWordsFiltered();
//        System.out.println(firstFilterFileNames);
        List<String> secondFilterFileNames =  generateNamesForFilteredToSevenUniqueCharMax();
//        System.out.println(secondFilterFileNames);
    }

    public static List<String> generateOriginalFileNames() {
        List<String> fileNames = new ArrayList<>();
        for(char c = 'a'; c <= 'z'; c++) {
            String s = Character.toString(c).toUpperCase();
            fileNames.add("../EOWL-v1.1.2/CSV Format/" + s + " Words.csv");
        }
        return fileNames;
    }

    public static List<String> generateNamesForThreeCharWordsFiltered() {
        List<String> newFileNames = new ArrayList<>();
        for(char c = 'a'; c <= 'z'; c++) {
            String s = Character.toString(c);
            newFileNames.add("src/Dictionaries/no_three/" + s + "_noThree.csv");
        }
        return newFileNames;
    }

    public static List<String> generateNamesForFilteredToSevenUniqueCharMax() {
        List<String> newFileNames = new ArrayList<>();
        for(char c = 'a'; c <= 'z'; c++) {
            String s = Character.toString(c);
            newFileNames.add("src/Dictionaries/no_seven/" + s + "_noThreeNoSeven.csv");
        }
        return newFileNames;
    }

    public void makeFile(String fileName) {
        try {
            File dictionary;
            dictionary = new File(fileName);
            if (dictionary.createNewFile()) {
                System.out.println("file created: " + dictionary.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("error" + e);
        }
    }
}
