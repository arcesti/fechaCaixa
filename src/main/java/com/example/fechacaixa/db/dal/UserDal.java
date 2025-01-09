package com.example.fechacaixa.db.dal;

import com.example.fechacaixa.db.entidades.User;
import com.example.fechacaixa.db.util.IDAL;
import com.example.fechacaixa.db.util.SingletonDB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDal implements IDAL<User> {

    @Override
    public boolean gravar(User entidade) {
        String sql = """
                    INSERT INTO usuario (cpf, usuario, senha) VALUES (?, ?, ?);
                """;
        try (PreparedStatement stmt = SingletonDB.getConexao().getConnect().prepareStatement(sql)){
            stmt.setString(1, entidade.getCpf());
            stmt.setString(2, entidade.getUsuario());
            stmt.setString(3, entidade.getSenha());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean alterar(User entidade) {
        String sql = """
                    UPDATE FROM usuario SET usuario = ? senha = ?
                    WHERE cpf = ?;
                """;
        try (PreparedStatement stmt = SingletonDB.getConexao().getConnect().prepareStatement(sql)) {
            stmt.setString(1, entidade.getUsuario());
            stmt.setString(2, entidade.getSenha());
            stmt.setString(3, entidade.getCpf());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean apagar(User entidade) {
        String sql = """
                    DELETE FROM usuario WHERE cpf = ?;
                """;
        try (PreparedStatement stmt = SingletonDB.getConexao().getConnect().prepareStatement(sql)) {
            stmt.setString(1, entidade.getCpf());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public User get(int id) {
        return null;
    }

    @Override
    public List<User> get(String filtro) {
        List<User> users =new ArrayList<>();
        String sql = """
                    SELECT * FROM usuario 
                """;
        if (!filtro.isEmpty()) {
            sql += "WHERE usuario LIKE ?";
        }
        sql += "ORDER BY usuario";
        try (PreparedStatement stmt = SingletonDB.getConexao().getConnect().prepareStatement(sql)) {
            stmt.setString(1, filtro + "%");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                users.add(new User(rs.getString("cpf"), rs.getString("usuario"), rs.getString("senha")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return users;
    }
}
