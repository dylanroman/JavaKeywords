//
// Name: Roman, Dylan
// Project: 1
// Due: 9-12-2025
// Course: cs-2400-03-f25
//
// Description: Main class. Uses LinkedBag implementation of bag to store strings from txt file.
//
//

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JavaKeywords {
    public static void main(String[] args) throws FileNotFoundException {
        // opens file
        File file = new File("javakeywords.txt");
        Scanner inFile = new Scanner(file);

        // creates bag to store file contents
        BagInterface<String> keywords = new LinkedBag<>();

        // stores contents of file in bag
        while (inFile.hasNext()) {
            keywords.add(inFile.next());
        }

        for(String token : args) {
            if (keywords.contains(token)) {
                System.out.printf("%s is a keyword\n", token);
            } else {
                System.out.printf("%s is not a keyword\n", token);
            }
        }


        // Testing for unused methods
        System.out.printf("%d Elements in Bag\n", keywords.getCurrentSize());
        String word = "continue";
        System.out.printf("Remove word 'continue' is %b\n" +
                "Current number of entries in bag: %d\n" +
                "Bag contains %s is %b",
                keywords.remove(word), keywords.getCurrentSize(), word, keywords.contains(word));
    }
}
