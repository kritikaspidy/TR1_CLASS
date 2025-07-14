import java.util.Scanner;

public class firstprogram
{
public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
   	System.out.println("enter name: ");
	String name = sc.nextLine();

	System.out.println("enter rollno: ");
	double rollno = sc.nextDouble();
	System.out.println("name: " + name);
	System.out.println("rollno: " + rollno);

  }

}