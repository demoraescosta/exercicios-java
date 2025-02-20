package fase1;

import java.util.Scanner;

public class Area 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("raio = ");
		double raio = sc.nextDouble();
		
		final double pi = 3.14159;
		
		System.out.println("area = " + (pi * Math.pow(raio, 2)));
		
		sc.close();
	}
}