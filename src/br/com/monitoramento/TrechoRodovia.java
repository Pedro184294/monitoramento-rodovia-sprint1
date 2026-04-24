package br.com.monitoramento;

public class TrechoRodovia {

    private double quilometroInicial;
    private double quilometroFinal;
    private double nivelVegetacao;
    private EquipeManutencao equipeResponsavel;

    public TrechoRodovia(double quilometroInicial, double quilometroFinal) {
        this.quilometroInicial = quilometroInicial;
        this.quilometroFinal = quilometroFinal;
        this.nivelVegetacao = 0.0;
    }

    public void registrarCrescimento(double taxa) {
        if (taxa <= 0) {
            System.out.println("Taxa inválida!");
            return;
        }
        this.nivelVegetacao += taxa;
    }

    public void atribuirEquipe(EquipeManutencao equipe) {
        this.equipeResponsavel = equipe;
    }

    public double getNivelVegetacao() {
        return nivelVegetacao;
    }

    public void setNivelVegetacao(double nivelVegetacao) {
        if (nivelVegetacao < 0) {
            System.out.println("Erro: valor negativo");
            return;
        }
        this.nivelVegetacao = nivelVegetacao;
    }

    public EquipeManutencao getEquipeResponsavel() {
        return equipeResponsavel;
    }

    // REGRA DE NEGÓCIO (IMPORTANTE)
    public boolean precisaDeManutencao() {
        return nivelVegetacao > 20;
    }
}