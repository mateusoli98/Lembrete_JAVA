package infra;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Lembrete;

public class LembreteDAO extends ConnectionFactory implements ILembreteDAO {

    private String query;
    private Connection conn;
    private PreparedStatement ps;

    @Override
    public boolean salvar(Lembrete lembrete) {
        String sql = "INSERT INTO lembrete (titulo, descricao) VALUES (?, ?);";

        try {
            conn = getConnection();
            PreparedStatement stam = conn.prepareStatement(sql);
            stam.setString(1, lembrete.getTitulo());
            stam.setString(2, lembrete.getDescricao());
            stam.executeUpdate();
            return true;
        } catch (ClassNotFoundException | SQLException e) {
        }
        return false;
    }

    @Override
    public void alterar(Lembrete l) {
        String sql = "UPDATE lembrete SET titulo = ?, descricao = ? WHERE id = ?;";

        try {
            conn = getConnection();
            PreparedStatement stam = conn.prepareStatement(sql);
            stam.setString(1, l.getTitulo());
            stam.setString(2, l.getDescricao());
            stam.setInt(3, (int) l.getId());

            stam.executeUpdate();
            stam.close();
        } catch (SQLException e) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LembreteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void excluir(Lembrete l) {
        String sql = "DELETE FROM lembrete WHERE id = ?;";
        try {
            conn = getConnection();
            PreparedStatement stam = conn.prepareStatement(sql);
            stam.setInt(1, (int) l.getId());
            stam.executeUpdate();
            stam.close();
        } catch (SQLException e) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LembreteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Lembrete> recuperarTodos() {
        List lembretes = new ArrayList();
        String sql = "SELECT * FROM lembrete;";
        try {
            conn = getConnection();
            PreparedStatement stam = conn.prepareStatement(sql);
            ResultSet rs = stam.executeQuery();
            while (rs.next()) {
                Lembrete c = new Lembrete();
                c.setId(rs.getInt("id"));
                c.setTitulo(rs.getString("titulo"));
                c.setDescricao(rs.getString("descricao"));
                lembretes.add(c);
            }

        } catch (ClassNotFoundException | SQLException e) {
        }

        return lembretes;
    }

    @Override
    public Lembrete recuperaByID(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Lembrete> recuperaByTitulo(String Titulo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object ConnectionFactory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
