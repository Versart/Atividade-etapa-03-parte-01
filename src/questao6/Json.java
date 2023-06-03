package questao6;

public class Json implements Formato{

    private Repositorio repositorio;

    public Json(Repositorio repositorio){
        this.repositorio = repositorio;
    }

    @Override
    public void formatar() {
        System.out.println("Formatando em JSON");
        repositorio.read();
    }
}
