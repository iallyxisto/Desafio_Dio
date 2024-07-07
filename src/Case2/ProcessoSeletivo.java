package Case2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProcessoSeletivo {
    private Rh rh = new Rh();

    private static final double SALARIO_BASE = 2000;
   //private static final int MAX_CANDIDATOS = 5;
    private ArrayList<Candidato> candidatos = new ArrayList<>(5);

    public void iniciarProcesso() throws Excecao {
        Scanner sc = new Scanner(System.in);

        while (true) {
            if (candidatos.size() >= 5) {
                System.out.println("Limite de candidatos atingido.");
                break;

            }


            try {
                System.out.println("Informe sua opção (0 para sair, 1 para adicionar candidato): ");
                int opc = sc.nextInt();

                if (opc == 0) {
                    System.out.println("Você saiu");
                    break;

                }
            }
            catch(InputMismatchException e){
                throw new Excecao("Informe um número válido");

            }


            System.out.println("NOME: ");
            String nome = sc.next();
            System.out.println("Pretensão salarial: ");
            double pretencaoSalarial = sc.nextDouble();


            if (pretencaoSalarial <= SALARIO_BASE) {
                Candidato candidato = new Candidato(nome, pretencaoSalarial);
                candidatos.add(candidato);
                // System.out.println("Candidato adicionado: " + candidato);
            } else {
                System.out.println("Pretensão salarial acima do salário base.");
            }

        }

        System.out.println("Candidatos selecionados:");
        for (Candidato candidato : candidatos) {
            System.out.println(candidato);
            rh.ligar(candidato);
        }
    }
}
