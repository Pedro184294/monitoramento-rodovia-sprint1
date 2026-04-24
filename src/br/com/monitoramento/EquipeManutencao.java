package br.com.monitoramento;

public class EquipeManutencao {

    private String nome;
    private int quantidadeFuncionarios;

    public EquipeManutencao(String nome, int quantidadeFuncionarios) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }
}