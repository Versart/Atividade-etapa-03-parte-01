package questao1;



public class SomadorAdapter extends SomadorExistente{
    private  SomadorVetor somadorVetor;

    public SomadorAdapter(SomadorVetor somadorVetor){
        this.somadorVetor = somadorVetor;
    }

    @Override
    public int somaLista() {
        int[] numeros =  this.somadorVetor.getNumeros();
        int soma = 0;
        for(int i = 0; i < numeros.length;i++)
            soma+= numeros[i];
        return soma;
    }
}
