import java.util.Scanner;

interface DispositivoEletronico {
    void ligar();
    void desligar();
}

class Smartphone implements DispositivoEletronico {
    public void ligar() {
        System.out.println("Smartphone ligado.");
    }

    public void desligar() {
        System.out.println("Smartphone desligado.");
    }
}

class Televisao implements DispositivoEletronico {
    public void ligar() {
        System.out.println("TV ligada.");
    }

    public void desligar() {
        System.out.println("TV desligada.");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DispositivoEletronico smartphone = new Smartphone();
        DispositivoEletronico tv = new Televisao();

        while (true) {
            System.out.println("Escolha um dispositivo: 1 - Smartphone | 2 - TV | 0 - Sair");
            int escolha = scanner.nextInt();

            if (escolha == 0) {
                System.out.println("Saindo...");
                break;
            }

            System.out.println("1 - Ligar | 2 - Desligar");
            int acao = scanner.nextInt();

            if (escolha == 1) {
                if (acao == 1) smartphone.ligar();
                else smartphone.desligar();
            } else if (escolha == 2) {
                if (acao == 1) tv.ligar();
                else tv.desligar();
            } else {
                System.out.println("Opção inválida.");
            }
        };


        scanner.close();
    }
}
