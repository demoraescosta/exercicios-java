package model;

public class Carro extends Veiculo implements Exibivel {
    private int portas;

    public Carro(String placa, String marca, String modelo, int ano, int portas) {
        super();
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    @Override
    public double calcularIPVA() {
        return 800.0 / (2025);
    }

    public void exibirDetalhes() {
        System.out.println("Tipo: Carro");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Cilindradas: " + getPortas());
        System.out.println("IPVA: " + calcularIPVA());
    }
}
