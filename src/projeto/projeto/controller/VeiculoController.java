package controller;

import model.Veiculo;
import model.execao.EntradaInvalidaException;
import model.execao.VeiculoNaoEncontradoException;

import java.util.ArrayList;

public class VeiculoController {
    private ArrayList<Veiculo> veiculos;

    public VeiculoController() {
        this.veiculos = new ArrayList<Veiculo>();
    }
    public void cadastrarVeiculo(Veiculo veiculo) throws EntradaInvalidaException {
        if (veiculo.getPlaca() == null || veiculo.getPlaca().isEmpty()) {
            throw new EntradaInvalidaException("Placa do veículo não pode ser vazia!");
        }

        for (Veiculo v : veiculos) {
            if (v.getPlaca().equalsIgnoreCase(veiculo.getPlaca())) {
                throw new EntradaInvalidaException("Já existe um veículo com esta placa!");
            }
        }

        veiculos.add(veiculo);
    }

    public ArrayList<Veiculo> listarVeiculos() {
        return veiculos;
    }

    public Veiculo buscarVeiculo(String placa) throws VeiculoNaoEncontradoException {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getPlaca().equalsIgnoreCase(placa)) {
                return veiculo;
            }
        }
        throw new VeiculoNaoEncontradoException("Veículo com placa " + placa + " não encontrado!");
    }

    public void atualizarVeiculo(String placa, Veiculo novoVeiculo)
            throws VeiculoNaoEncontradoException, EntradaInvalidaException {
        Veiculo veiculo = buscarVeiculo(placa);
        veiculos.remove(veiculo);
        cadastrarVeiculo(novoVeiculo);
    }

    public void removerVeiculo(String placa) throws VeiculoNaoEncontradoException {
        Veiculo veiculo = buscarVeiculo(placa);
        veiculos.remove(veiculo);
    }}
