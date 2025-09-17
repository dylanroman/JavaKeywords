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
        System.out.println("Java Keywords by D. Roman\n");

        // opens file
        File file = new File("javakeywords.txt");
        Scanner inFile = new Scanner(file);

        // creates bag to store file contents
        BagInterface<String> keywords = new LinkedBag<>();

        // stores contents of file in bag
        while (inFile.hasNext()) {
            keywords.add(inFile.next());
        }

        System.out.println("# Java Keywords Loaded\n");

        for(String token : args) {
            if (keywords.contains(token)) {
                System.out.printf("%s is a keyword\n", token);
            } else {
                System.out.printf("%s is not a keyword\n", token);
            }
        }

        Object[] words = keywords.toArray();
        for (int i = 0; i < words.length; i++) {
            if (i % 6 == 0) {
                System.out.println();
            }
            System.out.printf("%-15s", words[i]);
        }

        // Testing for unused methods
        System.out.println("\n\nTesting Unused Methods\n");

        // getCurrentSize()
        System.out.printf("getCurrentSize()\nNumber of Elements in Bag: %d\n\n", keywords.getCurrentSize());

        // remove(T anEntry)
        System.out.println("remove(anEntry)");
        System.out.println(testRemove("keyword", keywords));
        System.out.println(testRemove("interface", keywords));

        // getFrequencyOf(T anEntry)
        System.out.println("getFrequencyOf(T anEntry)");
        String word = "instanceof";
        System.out.printf("%s appears in bag %d times\n", word, keywords.getFrequencyOf(word));
        keywords.add(word);
        System.out.printf("Added %s to bag once\n", word);
        System.out.printf("%s appears in bag %d times\n", word, keywords.getFrequencyOf(word));
        System.out.printf("%s appears in bag %d times\n\n", "keyword", keywords.getFrequencyOf("keyword"));

        // isEmpty() / clear()
        System.out.println("isEmpty / clear()");
        System.out.printf("isEmpty() returns %b\n", keywords.isEmpty());
        keywords.clear();
        System.out.println("Cleared Bag");
        System.out.printf("isEmpty() returns %b\n", keywords.isEmpty());
        System.out.printf("Number of Elements in Bag: %d", keywords.getCurrentSize());
    }

    public static String testRemove(String word, BagInterface<String> bag) {
        StringBuilder output = new StringBuilder();
        output.append(String.format("remove(\"%s\") returns %b\n", word, bag.remove(word)));
        output.append(String.format("Bag contains(\"%s\") returns %b\n", word, bag.contains(word)));
        output.append(String.format("Number of Elements in Bag: %d\n", bag.getCurrentSize()));


        return output.toString();
    }
}
