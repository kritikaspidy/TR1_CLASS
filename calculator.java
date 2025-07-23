import java.util.Scanner;

public class calculator {
    public static void main(){
    }
    public void add(int a,int b){
        int A=a;
        int B=b;
        int result = a+b;
        System.out.println("addition of A and B: " + result);

    }
    public void subtract(int a,int b){
        int A=a;
        int B=b;
        int result = a-b;
        System.out.println("subtraction of A and B: " + result);

    }
    public void multiply(int a,int b){
        int A=a;
        int B=b;
        int result = a*b;
        System.out.println("multiplication of A and B: " + result);

    }
    public void division(int a,int b){
        int valueA=a;
        int valueB=b;
        int result = a%b;
        System.out.println("division of A and B: " + result);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1:");
        int valueA = sc.nextInt();
        System.out.println("Enter Number 2:");
        int valueB = sc.nextInt();

        calculator obj = new calculator();

        obj.add(valueA,valueB);
        obj.division(valueA,valueB);
        obj.multiply(valueA,valueB);
        obj.subtract(valueA,valueB);
    }
}