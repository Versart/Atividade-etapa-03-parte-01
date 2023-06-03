package questao5;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Texto linha1 = new Linha("João");
        Texto linha2 = new Linha("Maria");
        Texto linha3 = new Linha("Ana");
        Texto tabela = new Tabela("Pessoas", List.of(linha1,linha2,linha3));
        tabela.imprimir();
    }
}
