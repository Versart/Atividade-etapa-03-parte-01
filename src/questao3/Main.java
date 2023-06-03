package questao3;

public class Main {
    public static void main(String[] args) {
        Experimento experimento = new Experimento();
        experimento.addRobo(new AplicacaoProdutoQuimico());
        experimento.addRobo(new ElevacaoTemperatura());

        experimento.executaComandos();

    }
}
