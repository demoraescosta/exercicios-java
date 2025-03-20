package fase3;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args)
    {
	    Scanner sc = new Scanner(System.in);
		System.out.print("numero = ");
		
		int n = sc.nextInt();

        int i = 1;
        while (i <= 10)
        {
            System.out.println(i * n);
            i++;
        }

		sc.close();
    }
}