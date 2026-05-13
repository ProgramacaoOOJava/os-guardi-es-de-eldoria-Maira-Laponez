     /*classe*/
public class Personagem {
    String nome;
    String classe;
    int nivel;
    int pontosDeVida;
    double poderBase;

    /*método construtor*/
    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }

    /*método exibir status*/
    public void exibirStatus() {
        System.out.println("Nome: " + nome + " - Classe: " + classe + " - Nivel: " + nivel + " - Pontos de Vida: " + pontosDeVida + " - Poder Base " + poderBase);
    }
}

