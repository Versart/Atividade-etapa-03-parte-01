package questao4;

import java.util.ArrayList;
import java.util.List;

public class Diretorio extends Elemento {
    private String name;
    private List<Elemento> elementoList;

    public Diretorio(String name, List<Elemento> elementoList) {
        this.name = name;
        this.elementoList = elementoList;
    }

    @Override
    public long tamanho() {
        System.out.println("Diretorio: " + name);
        long tamanho = 0;
        for (Elemento elemento : elementoList)
            tamanho += elemento.tamanho();
        return tamanho;
    }
}
