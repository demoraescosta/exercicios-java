class Funcionario {
    String nome;
    double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }
}

class Gerente extends Funcionario {
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 1.20;
    }
}

class Estagiario extends Funcionario {
    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 1.05;
    }
}

public class Main {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("twelves", 2);
        Gerente g = new Gerente("çsfgiho", 50029290);
        Estagiario e = new Estagiario("André", 2147483647);

        System.out.println(f.nome + "salario: R$" + f.calcularSalario());
        System.out.println(g.nome + "salario: R$" + g.calcularSalario());
        System.out.println(e.nome + "salario: R$" + e.calcularSalario());
    }
}