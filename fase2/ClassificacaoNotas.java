import java.util.Scanner;

public class ClassificacaoNotas 
{
    public static void main(String[] args)
    {
	    Scanner sc = new Scanner(System.in);
		System.out.print("nota = ");
		
		int nota = sc.nextInt();

        if (nota < 0 || nota > 10)
        {
            System.out.println("nota invalida");
            sc.close();
            return;
        }

		String s = new String();
        char[] tabela = {
            'E', 'E',
            'D', 'D',
            'C', 'C',
            'B', 'B',
            'A', 'A'
        };

		System.out.println(tabela[nota + 1]);
        
		System.out.println(s);
		sc.close();
    }
}
