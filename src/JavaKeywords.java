//
// Name: Roman, Dylan
// Project: 1
// Due: 9-12-2025
// Course: cs-2400-03-f25
//
// Description: Main class. Uses LinkedBag implementation of bag to store strings from txt file.
//
//

import javax.xml.transform.stream.StreamSource;
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

        while(!keywords.isEmpty()){
            try {
                System.out.println(keywords.remove());
            } catch (NullPointerException e) {
                break;
            }


        }

//        String[] test = keywords.toArray();
//        for (String word : test) {
//            System.out.println(word);
//        }
    }
}
