// ****************************************************************
// ParseInts.java
//
// Reads a line of text and prints the integers in the line.
//
// ****************************************************************
import java.util.Scanner;

public class ParseInts {
    public static void main(String[] args) {
        int val, sum = 0;
        Scanner scan = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter a line of text:");
        String line = scan.nextLine();
        

        Scanner scanLine = new Scanner(line);

        while (scanLine.hasNext()) {
            try {
                val = Integer.parseInt(scanLine.next());
                sum += val;
            } catch (NumberFormatException e) {
                System.out.println("Tolong gunakan angka");
            }
        }

        // Print the sum of integers
        System.out.println("The sum of the integers on this line is " + sum);

        // Close scanners
        scan.close();
        scanLine.close();
    }
}

