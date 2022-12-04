package test;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IOSearcher {

    public static boolean search(String word, String... fileNames) {
        for (String fileName : fileNames) {
            try {
                Scanner textScanner = new Scanner(new File(fileName));
                while (textScanner.hasNextLine()) {
                    String line = textScanner.nextLine();
                    //MIGHT NEED TO SPLIT WITH DELIMITERS
                    if(line.contains(" " + word + " ")) {
                        return true;
                    }
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException("File was not found");
            }
        }
        return false;
    }
}
