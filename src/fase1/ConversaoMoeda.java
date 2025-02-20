package fase1;

import java.util.Scanner;

public class ConversaoMoeda 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("valor em reais = ");
		double valor_reais = sc.nextDouble();
		double cotacao_dolar = 5.704;

		System.out.println("valor em dolares = " + (valor_reais * cotacao_dolar));
		
		sc.close();
	}

}
