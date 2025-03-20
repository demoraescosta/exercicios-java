package fase3;

import java.util.Scanner;

public class SomaNNaturais 
{
    public static void main(String[] args)
    {
	    Scanner sc = new Scanner(System.in);
		System.out.print("numero = ");
		
		int n = sc.nextInt();
        int acumulador = 0;

        for (int i = 0; i < n; i++)
        {
            acumulador += i;
        }

		System.out.println(acumulador);
		sc.close();
    }
}
