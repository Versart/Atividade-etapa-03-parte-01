package questao4;

public class Arquivo extends Elemento{
    private String texto;
    public Arquivo(String texto) {
        this.texto = texto;
    }
    @Override
    public long tamanho() {
        long tamanhoArquivo = texto.length();
        System.out.println("Arquivo:" + texto + " Tamanho : " + tamanhoArquivo );
        return tamanhoArquivo;
    }
}
