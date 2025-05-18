import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {

        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Print prompt to user using System.out
        System.out.print("Enter a byte value: ");
        byte by = scanner.nextByte();

        System.out.print("Enter a short value: ");
        short s = scanner.nextShort();

        System.out.print("Enter an int value: ");
        int i = scanner.nextInt();

        System.out.print("Enter a long value: ");
        long l = scanner.nextLong();

        System.out.print("Enter a float value: ");
        float f = scanner.nextFloat();

        System.out.print("Enter a double value: ");
        double d = scanner.nextDouble();

        System.out.print("Enter a boolean value (true/false): ");
        boolean bool = scanner.nextBoolean();

        System.out.print("Enter a char value: ");
        char c = scanner.next().charAt(0);  // read first character of a string

        System.out.print("Enter a string: ");
        scanner.nextLine();  // consume the leftover newline
        String str = scanner.nextLine();

        // Output everything using System.out
        System.out.println("\nYou entered:");
        System.out.println("byte: " + by);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("boolean: " + bool);
        System.out.println("char: " + c);
        System.out.println("string: " + str);

        scanner.close();  // always close the scanner
    }
}
