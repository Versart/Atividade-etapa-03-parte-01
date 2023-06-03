package questao5;

import java.util.List;

public class Tabela extends Texto {
    private String nome;
    private List<Texto> linhas;

    public Tabela(String nome, List<Texto> linhas) {
        this.nome = nome;
        this.linhas = linhas;
    }

    @Override
    public void imprimir() {
        System.out.println("| " + nome.toUpperCase() + " |" );
        for (Texto linha : linhas)
                linha.imprimir();
    }
}
