package infra;

import java.util.List;
import model.Lembrete;

public interface ILembreteDAO {

    public boolean create(Lembrete lembrete);

    public boolean update();

    public boolean delete();

    public List<Lembrete> read();
}
