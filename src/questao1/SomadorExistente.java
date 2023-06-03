package questao1;

import java.util.List;

public class SomadorExistente {
    private List<Integer> numeros;

    public SomadorExistente(List<Integer> numeros){
        this.numeros = numeros;
    }
    public SomadorExistente() {

    }
    public int somaLista() {
        int soma = 0;
        for (Integer numero : numeros)
            soma+= numero;
        return soma;
    }

    public List<Integer> getNumeros() {
        return numeros;
    }
}
