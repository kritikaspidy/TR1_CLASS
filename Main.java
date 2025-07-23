import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("no. 1: ");
        int a = sc.nextInt();
        System.out.print("no. 2: ");
        int b = sc.nextInt();
        System.out.print("no. 3: ");
        int c = sc.nextInt();
        System.out.print("no. 4: ");
        int d = sc.nextInt();

        int max = (a > b) ? a : b;
        max = (max > c) ? max : c;
        max = (max > d) ? max : d;
        System.out.println("Maximum number is: " + max);

        sc.close();
    }
}