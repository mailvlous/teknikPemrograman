import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String myString = "Hello World!";

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Write some strings: ");
        String A = scanner.next();
        System.out.println("Write some strings: ");
        String B = scanner.next();

        int lengthA = A.length();
        int lengthB = B.length();
        System.out.println(lengthA+lengthB);

        int result = A.compareTo(B);
        if (result > 0 ) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String newA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String newB = B.substring(0, 1).toUpperCase() + B.substring(1);

        System.err.println(newA+" "+newB);


        scanner.close();
    }
}
