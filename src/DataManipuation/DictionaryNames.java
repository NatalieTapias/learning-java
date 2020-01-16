package DataManipuation;

import java.util.ArrayList;
import java.util.List;

public class DictionaryNames {

    public static void main(String[] args) {
        List<String> originalFileNames = generateOriginalFileNames();
        System.out.println(originalFileNames);
        List<String> firstFilterFileNames =  generateNamesForThreeCharWordsFiltered();
        System.out.println(firstFilterFileNames);
        List<String> secondFilterFileNames =  generateNamesForFilteredToSevenUniqueCharMax();
        System.out.println(secondFilterFileNames);
    }

    public static List<String> generateOriginalFileNames() {
        List<String> fileNames = new ArrayList<>();
        for(char c = 'a'; c <= 'z'; c++) {
            String s = Character.toString(c).toUpperCase();
            fileNames.add("src/Dictionaries/" + s + " Words.csv");
        }
        return fileNames;
    }

    public static List<String> generateNamesForThreeCharWordsFiltered() {
        List<String> newFileNames = new ArrayList<>();
        for(char c = 'a'; c <= 'z'; c++) {
            String s = Character.toString(c);
            newFileNames.add("src/Dictionaries/2" + s + "_noThree.csv");
        }
        return newFileNames;
    }

    public static List<String> generateNamesForFilteredToSevenUniqueCharMax() {
        List<String> newFileNames = new ArrayList<>();
        for(char c = 'a'; c <= 'z'; c++) {
            String s = Character.toString(c);
            newFileNames.add("src/Dictionaries/3" s + "_noThreeNoSeven.csv");
        }
        return newFileNames;
    }
}
