package model;

public class Moto extends Veiculo implements Exibivel {
    private int cilindrada;

    public Moto(String placa, String marca, String modelo, int ano, int cilindradas) {
        super();
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    @Override
    public double calcularIPVA() {
        return 400.0 / (2025);
    }
    public void exibirDetalhes() {
        System.out.println("Tipo: Moto");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Cilindradas: " + getCilindrada());
        System.out.println("IPVA: " + calcularIPVA());
    }
}
