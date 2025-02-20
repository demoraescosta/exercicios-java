package fase1;

import java.util.Scanner;

public class ConversaoIdade 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("idade = ");
		int idade = sc.nextInt();
		
		System.out.println("idade em dias = " + (idade * 356));
		
		sc.close();
	}
}
