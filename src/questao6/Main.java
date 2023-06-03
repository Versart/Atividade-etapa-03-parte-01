package questao6;

public class Main {
    public static void main(String[] args) {
        Repositorio repositorio = new PessoaRepositorio();
        Formato formato = new Json(repositorio);
        formato.formatar();
    }
}
