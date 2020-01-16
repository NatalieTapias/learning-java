package Notes;

import java.io.*;
import java.net.URL;

public class FileDemo {
    public static void main(String[] args) throws IOException {
//      Resources
//        https://stackabuse.com/reading-and-writing-csvs-in-java/
//        https://www.youtube.com/watch?v=3YRahx2ltSg
        //files
        File path = new File("hello.txt");
        System.out.println("We got a file " + path);

        System.out.println("Does it exist?" + path.exists());
        System.out.println("wat?" + path.isDirectory());

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
        URL url = new URL("http://www.gutenberg.org/cache/epub/2265/pg2265.txt");
        InputStream stream = url.openStream();
        // set up the BufferendReader using a new InputStreamReader of the file you are streaming
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        // read one line at a time
        String line = reader.readLine();
        //while there is still material on the next line, keep reading
        while(line != null){
            // this is where I would outputstream to file
            System.out.println(line);
            line = reader.readLine();
        }
        System.out.println("Done Reading!");
        //output streams to write
        //input to read from files
        //scanner class to count all the words
    }
}
