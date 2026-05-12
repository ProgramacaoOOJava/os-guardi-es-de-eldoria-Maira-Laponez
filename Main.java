public class Main {
    public static void main(String[] args) {
        Personagem heroi1 = new Personagem("Zilong", "Guerreiro", 1, 100, 8.5);
        Personagem heroi2 = new Personagem("Gord", "Mago", 1, 100, 6.5);
        Personagem heroi3 = new Personagem("Miya", "Arqueiro", 1, 100, 10.5);
        heroi1.exibirInformacoes();
        heroi2.exibirInformacoes();
        heroi3.exibirInformacoes();
    }
}
