package fase1;

import java.util.Scanner;

public class DistanciaDoisPontos 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x1 =");
		double x1 = sc.nextDouble();
		
		System.out.print("x2 =");
		double x2 = sc.nextDouble();
		
		System.out.print("y1 =");
		double y1 = sc.nextDouble();
		
		System.out.print("y2 =");
		double y2 = sc.nextDouble();
		
		double res = Math.pow(Math.sqrt(x2 * x2), 2) + Math.pow((y2 - y1), 2);
		System.out.println("disatncia = " + (res));
		
		sc.close();
	}
}
