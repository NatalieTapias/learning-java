package Notes;

import java.io.*;
import java.net.URL;

public class FileDemo {
    public static void main(String[] args) throws IOException {
//      Resources
//        https://stackabuse.com/reading-and-writing-csvs-in-java/
//        https://www.youtube.com/watch?v=3YRahx2ltSg
        //files
//        File path = new File("hello.txt");
//        path.createNewFile();
//        System.out.println("We got a file " + path);
//
//        System.out.println("Does it exist?" + path.exists());
//        System.out.println("wat?" + path.isDirectory());

        //streams
        // streams is a pipe that bytes go into
        // output stream
        // input stream  - a pipe where you can read bytes
//        String contentstoWrite = "helloWorld";
//        OutputStream outStream = new FileOutputStream(path);
//        outStream.write(contentstoWrite.getBytes());
//        outStream.close();

        // reading
        // BufferedReader because a stream is limited
//        BufferedReader reader = new BufferedReader( new InputStreamReader(new FileInputStream(path)));
//        String firstLine = reader.readLine();
//        reader.close();
//        System.out.println("Read a line: " +firstLine);

        //cool stream stuff
        // 1. open a url from the internet (an input stream, read the file from the internet one byte at a time)
        // a. first grab the file you want:
//        URL url = new URL("http://www.gutenberg.org/cache/epub/2265/pg2265.txt");
//        InputStream stream = url.openStream();

        File fileName = new File("../EOWL-v1.1.2/CSV Format/A Words.csv");
        File writeFile = new File("new_a.csv");
        writeFile.createNewFile();

        // set up the BufferendReader using a new InputStreamReader of the file you are streaming
        // BufferedReader reader = new BufferedReader( new InputStreamReader(new FileInputStream(path)));

        BufferedReader reader = new BufferedReader( new InputStreamReader(new FileInputStream(fileName)));
        FileWriter writer = new FileWriter(writeFile);
        String line = reader.readLine();
        writer.write(line);

        while(line != null){
            if(line.toString().length() > 4){
                line = reader.readLine();
                writer.write(line + "\n");
            }
        }
        writer.close();
        reader.close();
    }
}
