package Checker;

import java.io.*;
import java.util.Arrays;
// from https://www.geeksforgeeks.org/determine-string-unique-characters/
class ReturnPangrams {
    final static int MAX_CHAR = 256;

    boolean hasUniqueAndSevenChars(String str)
    {
        // If length is greater than 256,
        // some characters must have been repeated
        if (str.length() > MAX_CHAR)
            return false;
        // If length is greater than 7 or less than 3 we don't want it
        if (str.length() != 7)
            return false;

        boolean[] chars = new boolean[MAX_CHAR];
        Arrays.fill(chars, false);

        for (int i = 0; i < str.length(); i++) {
            int index = (int)str.charAt(i);

            /* If the value is already true, string
               has duplicate characters, return false */
            if (chars[index] == true)
                return false;
            chars[index] = true;
        }
        /* No duplicates encountered, return true */
        return true;
    }

    public static void main(String args[]) throws IOException {
        ReturnPangrams obj = new ReturnPangrams();
        FileWriter fw = new FileWriter("example2.csv");
        PrintWriter pw = new PrintWriter(fw);

        File fileName = new File("../EOWL-v1.1.2/CSV Format/A Words.csv");
        BufferedReader reader = null;

        try {
            reader = new BufferedReader( new InputStreamReader(new FileInputStream(fileName)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String input = reader.readLine();
        while ((input = reader.readLine()) != null) {
            input = reader.readLine();
            if (obj.hasUniqueAndSevenChars(input))
                pw.println(input);
        }
                /* here is where I would write to file to save the word */
            reader.close();
            pw.close();
        }
    }

//    public static void createReadWriteFile() {

//        try {
//            FileWriter fw = new FileWriter("example2.csv");
//            PrintWriter pw = new PrintWriter(fw);
//            pw.println(pangram);
//            pw.close();
//        } catch (IOException e) {
//            System.out.println("Error!");
//        }
//        File fileName = new File("../EOWL-v1.1.2/CSV Format/A Words.csv");
//        File writeFile = new File("new_a.csv");
//        writeFile.createNewFile();
//        BufferedReader reader = new BufferedReader( new InputStreamReader(new FileInputStream(fileName)));
//        FileWriter writer = new FileWriter(writeFile);
//        String line = reader.readLine();
//        writer.write(line);
//        writer.close();
//        reader.close();
//    }

