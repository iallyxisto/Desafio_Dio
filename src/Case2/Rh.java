package Case2;

public class Rh {


    public int maxTentativas = 3;
    public int tentativasLig = 0;
    boolean atendeu = false;

    public void ligar(Candidato candidato) {
        while (tentativasLig < maxTentativas && !atendeu) {
            tentativasLig++;
            System.out.println("Tentativa: " + tentativasLig + "\nPara :" + candidato.nome);
            atendeu= simularRespostaCandidato();
        }
        if (atendeu) {
            System.out.println("Candidato " + candidato.getNome() + " atendeu na tentativa " + tentativasLig);
        } else if (tentativasLig == 3) {
            System.out.println("Candidato " + candidato.getNome() + " não atendeu após 3 tentativas.");
        }
    }
    private  boolean simularRespostaCandidato(){
        return Math.random()>0.5;
    }
}
