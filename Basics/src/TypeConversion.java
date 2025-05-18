import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Automatic type casting...
        // asking for float and giving int, will work
        // asking for int and giving float, won't work automatically (data loss)

        float num = input.nextInt(); // will work
        // int num2 = input.nextFloat(); // should throw error - Input MissMatch

        // then how to convert int to float?
        // => Done via "Type Casting"
        // compressing the bigger no. into smaller one. . .

        int result = (int) 67.56f;
        System.out.println("Result (float to int): " + result);


        // automatic type promotion in expressions
        int a = 257;
        // byte size is - 256
        byte b = (byte) a;
        System.out.println("Byte after promotion(257): " + b); // prints 1 - 256%257

        // another exp of automatic type conversion - char converted to in
        // gives ASCII value of that char
        int number = 'A';
        System.out.println(number);

        // RULES for automatic promotion
        // - 1. all the byte short and char value promoted to int
        // - 2. if any one of the operand is long/float/double
        // -> whole operation will be evaluated to them respectively

        // converted to double
        System.out.println(3 * 5.3243);
    }
}
