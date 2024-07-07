package Case2;

public class Main {
    public static void main(String[] args) {

            try {
                ProcessoSeletivo processoSeletivo = new ProcessoSeletivo();
                processoSeletivo.iniciarProcesso();
            } catch (Excecao e) {
                System.out.println("Erro: " + e.getMessage());

        }
    }
}
