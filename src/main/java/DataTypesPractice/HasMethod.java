package DataTypesPractice;

import java.util.Scanner;

public class HasMethod {
    void main() {
        String name  = "sangay yeshi tandi tshering";
        Scanner scanner = new Scanner(name);
        int lineNumber = 1;
        while (scanner.hasNext()) {
            String line = scanner.nextLine();

            System.out.println(lineNumber + " " + line);
            lineNumber++;


        }
    }
}
