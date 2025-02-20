package fase1;

import java.util.Scanner;

public class CalculoMedia 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a = ");
		double a = sc.nextDouble();
		
		System.out.print("b = ");
		double b = sc.nextDouble();
		
		System.out.print("c = ");
		double c = sc.nextDouble();
		
		System.out.println("media(a, b) = " + ((a + b + c) / 3));
		
		sc.close();
	}
}
