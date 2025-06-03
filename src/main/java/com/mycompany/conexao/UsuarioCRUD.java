
package com.mycompany.conexao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Gabi
 */
public class UsuarioCRUD {
     public boolean cadastrar(String login, String senha) {
        try (Connection conn = Conexao.conectar()) {
            String sql = "INSERT INTO users (login, senha) VALUES (?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, login);
            stmt.setString(2, senha);
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean autenticar(String login, String senha) {
        try (Connection conn = Conexao.conectar()) {
            String sql = "SELECT * FROM users WHERE login = ? AND senha = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, login);
            stmt.setString(2, senha);
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            return false;
        }
    }

    public List<String[]> listarUsuarios() {
        List<String[]> lista = new ArrayList<>();
        try (Connection conn = Conexao.conectar()) {
            String sql = "SELECT * FROM users";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                lista.add(new String[]{rs.getString("login"), rs.getString("senha")});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public boolean atualizarUsuario(String loginAntigo, String novoLogin, String novaSenha) {
        try (Connection conn = Conexao.conectar()) {
            String sql = "UPDATE users SET login = ?, senha = ? WHERE login = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, novoLogin);
            stmt.setString(2, novaSenha);
            stmt.setString(3, loginAntigo);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean excluirUsuario(String login) {
        try (Connection conn = Conexao.conectar()) {
            String sql = "DELETE FROM users WHERE login = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, login);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            return false;
        }
    }
}
