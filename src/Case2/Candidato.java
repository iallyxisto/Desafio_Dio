package Case2;

public class Candidato {
    String nome;
    double pretencaoSalarial;


    public Candidato(String nome, double pretencaoSalarial) {
        this.nome = nome;
        this.pretencaoSalarial = pretencaoSalarial;
    }
    @Override
    public String toString() {
        return "Nome:" + nome + '\'' +
                "\nPretencao Salarial=" + pretencaoSalarial;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPretencaoSalarial() {
        return pretencaoSalarial;
    }

    public void setPretencaoSalarial(double pretencaoSalarial) {
        this.pretencaoSalarial = pretencaoSalarial;
    }
}