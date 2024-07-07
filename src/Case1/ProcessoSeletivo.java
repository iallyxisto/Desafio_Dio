package Case1;

import java.util.Scanner;

public class ProcessoSeletivo {
    public static void main(String[] args) {

         Candidato c1 = new Candidato(1500);
         Candidato c2 = new Candidato(2000);
         Candidato c3 = new Candidato(3500);

        //Criando diretamente a classe main sem o uso de outras classes.

//        Scanner sc = new Scanner(System.in);
//        double salarioBase = 2000.0;
//        double salarioPretendido;
//        System.out.println("Informe o salario pretendido");
//        salarioPretendido = sc.nextDouble();
//
//        if (salarioBase > salarioPretendido) {
//            System.out.println("Ligar para candidato");
//        } else if (salarioBase == salarioPretendido) {
//            System.out.println("Ligar para o canditado, com contra" +
//                    "proposta");
//        }
//        else System.out.println("Aguardando resultado dos demais candidatos");

//////////////////////////////////////////////////////////////////////////////////////

        /* Criando com a responsabilidade apenas do canditado, sem analisar o mesmo na
        propria classe.
         */

//        Candidato cd1 = new Candidato(1500);
//        Candidato cd2 = new Candidato(2000);
//        Candidato cd3 = new Candidato(3000);
//        if (salarioBase > cd1.getSalarioPretendido()) {
//            System.out.println("Ligar para candidato");
//        } else if (salarioBase == cd1.getSalarioPretendido()) {
//            System.out.println("Ligar para o canditado, com contra" +
//                    "proposta");
//        }
//        else System.out.println("Aguardando resultado dos demais candidatos");



    }
}
