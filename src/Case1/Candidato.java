package Case1;

public class Candidato {

    private double salarioPretendido;
    private double salarioBase = 2000.0;
    public Candidato(double salarioPretendido) {
        this.salarioPretendido = salarioPretendido;

        if (this.salarioBase > this.getSalarioPretendido()) {
            System.out.println("Ligar para candidato");
        } else if (this.salarioBase == this.getSalarioPretendido()) {
            System.out.println("Ligar para o canditado, com contra" +
                    "proposta");
        }
        else System.out.println("Aguardando resultado dos demais candidatos");

    }

    public double getSalarioPretendido() {
        return salarioPretendido;
    }

    public void setSalarioPretendido(double salarioPretendido) {
        this.salarioPretendido = salarioPretendido;
    }
}
