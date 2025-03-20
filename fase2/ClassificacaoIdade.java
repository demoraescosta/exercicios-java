import java.util.Scanner;  

public class ClassificacaoIdade
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
		System.out.print("idade = ");
		
		int n = sc.nextInt();

		String s = new String();
	
		if (n < 18)
		{
			s = "menor de idade";
		}
		else if (n < 60)
		{
			s = "adulto";
		}
		else
		{
			s = "idoso";
		}

		System.out.println(s);
		sc.close();
	}
}