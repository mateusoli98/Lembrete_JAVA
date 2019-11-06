package infra;

import model.Lembrete;

public interface ILembreteDAO {

    public boolean create(Lembrete lembrete);

    public boolean update();

    public boolean delete();

    public boolean read();

}
