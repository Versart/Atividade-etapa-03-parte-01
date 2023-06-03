package questao4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Elemento elemento1 = new Arquivo("Trabalho");
        Elemento elemento2 = new Arquivo("Apresentação");
        Elemento diretorio = new Diretorio("Faculdade", List.of(elemento1,elemento2));
        System.out.println("Tamanho Total: " + diretorio.tamanho());

    }
}
