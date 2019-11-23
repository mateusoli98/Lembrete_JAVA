package infra;

import java.util.List;
import model.Lembrete;

public interface ILembreteDAO {

    public boolean salvar(Lembrete l);

    public void alterar(Lembrete l);

    public void excluir(Lembrete l);

    public List<Lembrete> recuperarTodos();

    public Lembrete recuperaByID(long id);

    public List<Lembrete> recuperaByTitulo(String Titulo);
}
