import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        int sum = a + b;
        int diff = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        int aBefore = a;
        int bBefore = b;
        a++;  
        b--;  

        // Output results
        System.out.println("\nResults:");
        System.out.println("Addition of a + b = " + sum);
        System.out.println("Subtraction of a - b = " + diff);
        System.out.println("Multiplication of a * b = " + product);
        System.out.println("Division of a / b = " + quotient);
        System.out.println("Modulus of a % b = " + remainder);
        System.out.println("a before increment: " + aBefore + ", after a++: " + a);
        System.out.println("b before decrement: " + bBefore + ", after b--: " + b);

        scanner.close();
    }
}