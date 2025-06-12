package model;

public class Caminhao extends Veiculo implements Exibivel{
    private int eixos;

    public Caminhao(String placa, String marca, String modelo, int ano, int eixos) {
        super();
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public void exibirDetalhes() {
        System.out.println("Tipo: Caminhão");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Eixos: " + getEixos());
        System.out.println("IPVA: " + calcularIPVA());
    }
}
