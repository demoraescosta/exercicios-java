package fase1;

import java.util.Scanner;

public class CalculoPerimetroArea 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("base = ");
		double base = sc.nextDouble();
		
		System.out.print("altura = ");
		double altura = sc.nextDouble();
		
		System.out.println("perim = " + (2 * (base + altura)));
		System.out.println("area = " + (base * altura));
		
		sc.close();
	}
}
