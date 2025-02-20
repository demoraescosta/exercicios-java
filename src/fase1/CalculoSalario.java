package fase1;

import java.util.Scanner;

public class CalculoSalario 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("salario bruto = ");
		double salario = sc.nextDouble();
		
		System.out.print("desconto inss = ");
		double inss_desconto = sc.nextDouble();
	 
		double res = salario - (salario * (inss_desconto / 100));
		
		System.out.println("salário liquido = " + res);
		
		sc.close();
	}
}
