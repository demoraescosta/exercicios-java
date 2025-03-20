import java.util.Scanner;

public class CalculadoraJava 
{
   	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);

		System.out.print("numero 1 = ");
		double num1 = sc.nextDouble();

		System.out.print("numero 2 = ");
        double num2 = sc.nextDouble();

        System.out.print("operação: ");
        char op = sc.next().charAt(0);

        double resultado = 0;

        switch (op) {
            case '+':
            {
                resultado = num1 + num2;
            } break;

            case '-':
            {
                resultado = num1 - num2;
            } break;
                
            case '*':
            {
                resultado = num1 * num2;
            } break;
                
            case '/':
                if (num2 == 0) 
                {
                    System.out.println("erro: divisão por zero");
                } 
                else 
                {
                    resultado = num1 / num2;
                }
                break;
                
            default:
                System.out.println("operação inválida");
                break;
        }

        System.out.println("resultado: " + resultado);
        sc.close();
	}
}
