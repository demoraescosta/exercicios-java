public class Veiculos {
    static class Veiculo {
        String marca;
        String modelo;
        int ano;

        Veiculo(String marca, String modelo, int ano) {
            this.marca = marca;
            this.modelo = modelo;
            this.ano = ano;
        }

        void exibirDados() {
            System.out.println("marca: " + marca + ", modelo: " + modelo + ", ano: " + ano);
        }
    }

    static class Carro extends Veiculo {
        int qntdPortas;

        Carro(String marca, String modelo, int ano, int qntdPortas) {
            super(marca, modelo, ano);
            this.qntdPortas = qntdPortas;
        }

        void exibirDados() {
            super.exibirDados();
            System.out.println("qntd portas: " + qntdPortas);
        }
    }

    static class Moto extends Veiculo {
        int cilindradas;

        Moto(String marca, String modelo, int ano, int cilindradas) {
            super(marca, modelo, ano);
            this.cilindradas = cilindradas;
        }

        void exibirDados() {
            super.exibirDados();
            System.out.println("cil.: " + cilindradas);
        }
    }

    public static void main(String[] args) {
        Carro carro = new Carro("moto", "fifdos349082309", 2222219, 2);
        Moto moto = new Moto("carro", "ljhds0921", 2043219, 6000);

        System.out.println("carro:");
        carro.exibirDados();

        System.out.println("\nmoto:");
        moto.exibirDados();
    }
}
