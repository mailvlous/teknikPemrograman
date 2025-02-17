import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        
        String num = scanner.next();
        scanner.close();
        
        long num1 = 0;
        try {
            num1 = Long.parseLong(num);
        } catch (NumberFormatException e) {
            System.out.println(num + " Can't be fitted anywhere.");
            System.exit(0);
        }
        
        System.out.println(num + " can be fitted in:");
        System.out.println("- Long");
        
        if (num1 > Integer.MAX_VALUE || num1 < Integer.MIN_VALUE) {
            System.exit(0);
        }
        System.out.println("- Integer");
        
        if (num1 > Short.MAX_VALUE || num1 < Short.MIN_VALUE) {
            System.exit(0);
        }
        System.out.println("- Short");
        
        if (num1 > Byte.MAX_VALUE || num1 < Byte.MIN_VALUE) {
            System.exit(0);
        }
        System.out.println("- Byte");
    }
}
