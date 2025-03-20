package fase3;

import java.util.Scanner;

public class Media {
    public static void main(String[] args)
    {
	    Scanner sc = new Scanner(System.in);
		System.out.print("numero = ");
		
        int n = sc.nextInt();
        double soma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("nota aluno " + i + " = ");
            double nota = sc.nextDouble();
            soma += nota;
        }
       
        double media = soma / n;
        System.out.println("media = " + media);

		sc.close();
    }
}
