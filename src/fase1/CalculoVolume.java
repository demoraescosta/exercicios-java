package fase1;

import java.util.Scanner;

public class CalculoVolume 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("raio esfera = ");
		double raio = sc.nextDouble();
		
		final double pi = 3.14159;
		
		System.out.println("volume = " + ((4/3) * pi * raio));
		
		sc.close();
	}

}
