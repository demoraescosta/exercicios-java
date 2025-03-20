package fase3;

import java.util.Scanner;

public class NumerosPrimos 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("numero inicial = ");
        int inicio = sc.nextInt();

        System.out.print("numero final = ");
        int fim = sc.nextInt();
        
        if (inicio > fim) 
        {
            System.out.println("numero inicial maior que final");
            sc.close();

            return;
        }

        System.out.println("primos entre " + inicio + " a " + fim + ":");
        for (int i = inicio; i <= fim; i++) 
        {
            Boolean primo = true;

            for (int j = 2; j <= Math.sqrt(i); j++) 
            {
                if (i % j == 0) 
                {
                    primo = false;
                    break;
                }
            }

            if (i > 1 && primo) 
            {
                System.out.println(i);
            }
        }

        sc.close();
    }

}    
