package questao6;

public class PessoaRepositorio implements Repositorio{

    @Override
    public void save() {
        System.out.println("Salvando Pessoa");
    }

    @Override
    public void delete() {
        System.out.println("Deletando Pessoa");
    }

    @Override
    public void read() {
        System.out.println("Lendo Pessoa");
    }
}
