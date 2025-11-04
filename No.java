public class No {
    String questao;
    No sim;
    No nao;
    String jogo;

    public No(String questao) {
        this.questao = questao;
        this.jogo = null;
    }

    public No (String jogo, boolean ehJogo) {
        this.jogo = jogo;
    }
}
