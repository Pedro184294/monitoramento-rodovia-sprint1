package br.com.monitoramento;

public class Principal {

    public static void main(String[] args) {

        System.out.println("===== RELATÓRIO =====");

        TrechoRodovia trecho1 = new TrechoRodovia(10, 15);
        TrechoRodovia trecho2 = new TrechoRodovia(20, 25);

        trecho1.registrarCrescimento(10);
        trecho2.registrarCrescimento(25);

        EquipeManutencao equipe = new EquipeManutencao("Equipe Alpha", 5);

        // Considerando trecho2 como crítico
        trecho2.atribuirEquipe(equipe);

        System.out.println("Trecho 1: " + trecho1.getNivelVegetacao() + " cm");
        System.out.println("Trecho 2: " + trecho2.getNivelVegetacao() + " cm");

        // Mostrar equipe associada
        if (trecho2.getEquipeResponsavel() != null) {
            System.out.println("Equipe responsável pelo trecho 2: "
                    + trecho2.getEquipeResponsavel().getNome());
        }

        // Separador visual
        System.out.println("\n===== ALERTAS =====");

        // Verificação usando método da classe (BOA PRÁTICA)
        if (trecho2.precisaDeManutencao()) {
            System.out.println("⚠️ Trecho 2 está crítico e precisa de manutenção!");
        } else {
            System.out.println("Nenhum trecho crítico no momento.");
        }
    }
}