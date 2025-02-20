package fase1;

import java.util.Scanner;

public class ConversaoTemperatura 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite temp em f: ");
		double f = sc.nextDouble();
		
		double c = (5.0 / 9.0) * (f - 32.0);
		System.out.println("c = " + c);
		
		sc.close();
	}
}
