package questao1;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        SomadorExistente somadorList = new SomadorExistente(List.of(1,2,3));
        SomadorExistente somadorVetor = new SomadorAdapter(new SomadorVetor(new int[]{1,2,3}));

        System.out.println("Somando List: " + somadorList.somaLista());
        System.out.println("Somando Array: " + somadorVetor.somaLista());
    }
}
