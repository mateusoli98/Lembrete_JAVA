package infra;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import model.Lembrete;

public class LembreteDAO extends ConnectionFactory implements ILembreteDAO {

    private String query;
    private Connection conn;
    private PreparedStatement ps;

    @Override
    public boolean create(Lembrete lembrete) {
        try {
            conn = getConnection();
            query = " INSERT INTO lembrete  VALUES ( default, ?, ?, default)";
            ps = conn.prepareStatement(query);
            ps.setString(1, lembrete.getTitulo());
            ps.setString(2, lembrete.getMensagem());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            query = "";
            try {
                conn.close();
                ps.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return false;
    }

    @Override
    public boolean update() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Lembrete> read() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
