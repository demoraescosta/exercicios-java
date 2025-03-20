import java.util.Scanner;  

public class AnoBissexto
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
		System.out.print("ano = ");
		
		int n = sc.nextInt();

		String s = new String();

		System.out.println(((n % 4 == 0) || (n % 100 == 0)) ? "bissexto" : "impar");
        
		System.out.println(s);
		sc.close();
	}
}