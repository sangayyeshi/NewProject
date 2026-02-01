package DataTypesPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneNumberAndPersonName {
    void main() {
//       // this is the solution for the hacker ranck
//        Scanner sc = new Scanner(System.in);
//
//
//        int n = sc.nextInt();
//        sc.nextLine(); // consume leftover newline
//
//        Map<String, String> phoneBook = new HashMap<>();
//
//        // Read name-number pairs
//        for (int i = 0; i < n; i++) {
//            String name = sc.nextLine();
//            String number = sc.nextLine();
//            phoneBook.put(name, number);
//        }
//
//        // Process queries
//        while (sc.hasNextLine()) {
//            String query = sc.nextLine();
//            if (phoneBook.containsKey(query)) {
//                System.out.println(query + "=" + phoneBook.get(query));
//            } else {
//                System.out.println("Not found");
//            }
//        }
//
//        sc.close();


        try {
            File file = new File("/Users/sangayyeshi/IdeaProjects/NewProject/src/main/java/DataTypesPractice/PhoneBooks.txt");
            Scanner sc = new Scanner(file);

            int n = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            Map<String, String> phoneBook = new HashMap<>();

// Read name-number pairs
            for (int i = 0; i < n; i++) {
                String name = sc.nextLine();
                String number = sc.nextLine();
                phoneBook.put(name, number);
            }

            // Process queries
            while (sc.hasNextLine()) {
                String query = sc.nextLine();
                if (phoneBook.containsKey(query)) {
                    System.out.println(query + "=" + phoneBook.get(query));
                } else {
                    System.out.println("Not found");
                }
            }

            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("phonebook.txt file not found");
        }
    }
}
