package questao5;

public class Linha extends Texto {
    private String conteudo;
    public Linha(String conteudo) {
        this.conteudo = conteudo;
    }
    @Override
    public void imprimir() {
        System.out.println("| " + conteudo + " |");
    }
}
