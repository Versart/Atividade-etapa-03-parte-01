package questao6;

public class Xml implements Formato{

    public Repositorio repositorio;

    public Xml(Repositorio repositorio){
        this.repositorio = repositorio;
    }
    @Override
    public void formatar() {
        System.out.println("Formatando em XML");
        repositorio.read();
    }
}
