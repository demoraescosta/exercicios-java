package projeto;

import controller.VeiculoController;
import model.*;
import model.execao.*;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Principal {
     public static VeiculoController controller = new VeiculoController();
     public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            exibirMenu();
            opcao = lerInteiro("Digite sua opção: ");

            try {
                switch (opcao) {
                    case 1:
                        cadastrarVeiculo();
                        break;
                    case 2:
                        listarVeiculos();
                        break;
                    case 3:
                        atualizarVeiculo();
                        break;
                    case 4:
                        removerVeiculo();
                        break;
                    case 5:
                        System.out.println("Saindo do sistema...");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } while (opcao != 5);
    }

    private static void exibirMenu() {
        System.out.println("\n=== MENU ===");
        System.out.println("1. Cadastrar Veículo");
        System.out.println("2. Listar Veículos");
        System.out.println("3. Atualizar Veículo");
        System.out.println("4. Remover Veículo");
        System.out.println("5. Sair");
    }

    private static void cadastrarVeiculo() throws EntradaInvalidaException {
        System.out.println("\n=== CADASTRAR VEÍCULO ===");
        System.out.println("1. Carro");
        System.out.println("2. Moto");
        System.out.println("3. Caminhão");
        int tipo = lerInteiro("Escolha o tipo: ");

        String placa = lerString("Placa: ");
        String marca = lerString("Marca: ");
        String modelo = lerString("Modelo: ");
        int ano = lerInteiro("Ano: ");

        switch (tipo) {
            case 1:
                int portas = lerInteiro("Número de portas: ");
                controller.cadastrarVeiculo(new Carro(placa, marca, modelo, ano, portas));
                break;
            case 2:
                int cilindradas = lerInteiro("Cilindradas: ");
                controller.cadastrarVeiculo(new Moto(placa, marca, modelo, ano, cilindradas));
                break;
            case 3:
                int eixos = lerInteiro("Número de eixos: ");
                controller.cadastrarVeiculo(new Caminhao(placa, marca, modelo, ano, eixos));
                break;
            default:
                throw new EntradaInvalidaException("Tipo de veículo inválido!");
        }

        System.out.println("Veículo cadastrado com sucesso!");
    }

    private static void listarVeiculos() {
        System.out.println("\n=== LISTA DE VEÍCULOS ===");
        ArrayList<Veiculo> veiculos = controller.listarVeiculos();
        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.");
        } else {
            for (Veiculo veiculo : veiculos) {
                veiculo.exibirDetalhes();
                System.out.println("---------------------");
            }
        }
    }

    private static void atualizarVeiculo() throws VeiculoNaoEncontradoException, EntradaInvalidaException {
        System.out.println("\n=== ATUALIZAR VEÍCULO ===");
        String placa = lerString("Digite a placa do veículo a ser atualizado: ");

        Veiculo veiculo = controller.buscarVeiculo(placa);
        veiculo.exibirDetalhes();

        System.out.println("\nDigite os novos dados:");
        String marca = lerString("Marca: ");
        String modelo = lerString("Modelo: ");
        int ano = lerInteiro("Ano: ");

        if (veiculo instanceof Carro) {
            int portas = lerInteiro("Número de portas: ");
            controller.atualizarVeiculo(placa, new Carro(placa, marca, modelo, ano, portas));
        } else if (veiculo instanceof Moto) {
            int cilindradas = lerInteiro("Cilindradas: ");
            controller.atualizarVeiculo(placa, new Moto(placa, marca, modelo, ano, cilindradas));
        } else if (veiculo instanceof Caminhao) {
            int eixos = lerInteiro("Número de eixos: ");
            controller.atualizarVeiculo(placa, new Caminhao(placa, marca, modelo, ano, eixos));
        }

        System.out.println("Veículo atualizado com sucesso!");
    }

    private static void removerVeiculo() throws VeiculoNaoEncontradoException {
        System.out.println("\n=== REMOVER VEÍCULO ===");
        String placa = lerString("Digite a placa do veículo a ser removido: ");

        controller.removerVeiculo(placa);
        System.out.println("Veículo removido com sucesso!");
    }

    private static String lerString(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    private static int lerInteiro(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número válido!");
            }
        }
    }
}