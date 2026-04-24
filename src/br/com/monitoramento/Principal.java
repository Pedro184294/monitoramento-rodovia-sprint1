package br.com.monitoramento;

public class Principal {

    public static void main(String[] args) {

        TrechoRodovia trecho1 = new TrechoRodovia(10, 15);
        TrechoRodovia trecho2 = new TrechoRodovia(20, 25);

        trecho1.registrarCrescimento(10);
        trecho2.registrarCrescimento(25);

        EquipeManutencao equipe = new EquipeManutencao("Equipe Alpha", 5);

        // Considerando trecho2 como crítico
        trecho2.atribuirEquipe(equipe);

        System.out.println("Trecho 1: " + trecho1.getNivelVegetacao() + " cm");

        System.out.println("Trecho 2: " + trecho2.getNivelVegetacao() + " cm");

        // MOSTRAR A EQUIPE ASSOCIADA
        if (trecho2.getEquipeResponsavel() != null) {
            System.out.println("Equipe responsável pelo trecho 2: " 
                + trecho2.getEquipeResponsavel().getNome());
        }

        // IDENTIFICAR TRECHO CRÍTICO
        if (trecho2.getNivelVegetacao() > 20) {
            System.out.println("⚠️ Trecho 2 está crítico e precisa de manutenção!");
        }
    }
}