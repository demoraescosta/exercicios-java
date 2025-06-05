import java.util.Scanner;

interface FormaGeometrica {
    double calcularArea();
    double calcularPerimetro();
}

class Retangulo implements FormaGeometrica {
    private double largura, altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }
}

class Circulo implements FormaGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}

public class FormasTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a largura do retângulo: ");
        double largura = scanner.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();
        Retangulo ret = new Retangulo(largura, altura);
        System.out.println("Área do Retângulo: " + ret.calcularArea());
        System.out.println("Perímetro do Retângulo: " + ret.calcularPerimetro());

        System.out.print("\nDigite o raio do círculo: ");
        double raio = scanner.nextDouble();
        Circulo circ = new Circulo(raio);
        System.out.println("Área do Círculo: " + circ.calcularArea());
        System.out.println("Perímetro do Círculo: " + circ.calcularPerimetro());

        scanner.close();
    }
}
