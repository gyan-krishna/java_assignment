//Write a java program to concatenate two strings.
import java.util.*;

public class Concatenate
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String a, b, sum;
		
		System.out.print("Enter String a :: ");
		a = sc.nextLine();

		System.out.print("Enter String b :: ");
		b = sc.nextLine();
		
		sum = a + b;
		
		System.out.println("Concatenated String :: "+sum);
	}
}