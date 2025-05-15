/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades.DAO;

import apoio.ConexaoBD;
import entidades.Jogos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author guilherme.schorr
 */
public class JogosDAO {
  
    private ResultSet resultadoQ = null; // interface que representa o resultado de uma consulta SQL executada em um banco de dados

    public void salvar(Jogos j) throws SQLException {

        String sql = ""
                + "INSERT INTO jogos (nome, quantidade, preco) VALUES ("
                + "'" + j.getNome() + "',"
                + "'" + j.getQuantidadeEstoque() + "',"
                + "'" + j.getPreco() + "'"
            
                + ")";

        System.out.println("sql: " + sql);

        ConexaoBD.executeUpdate(sql);

    }

    public ArrayList<Jogos> recuperarTodos() throws SQLException {
        ArrayList<Jogos> jogos = new ArrayList();

        String sql = ""
                + "SELECT * FROM jogos ";

        resultadoQ = ConexaoBD.executeQuery(sql);

        while (resultadoQ.next()) {
            Jogos j = new Jogos();

            j.setId(resultadoQ.getInt("id"));
            j.setNome(resultadoQ.getString("nome"));
            j.setQuantidadeEstoque(resultadoQ.getInt("quantidade"));
            j.setPreco(resultadoQ.getDouble("preco"));
        

            jogos.add(j);
        }

        return jogos;
    }

    public Jogos recuperar(int id) throws SQLException {
        Jogos jogo = null;
        String sql = ""
                + "SELECT * FROM jogos WHERE id = " + id;

        resultadoQ = ConexaoBD.executeQuery(sql);

        if (resultadoQ.next()) {
            jogo = new Jogos();

            jogo.setId(resultadoQ.getInt("id"));
            jogo.setNome(resultadoQ.getString("nome"));
            jogo.setQuantidadeEstoque(resultadoQ.getInt("quantidade"));
            jogo.setPreco(resultadoQ.getDouble("preco"));
           
        }

        return jogo;
    }

    public void editar(Jogos j) throws SQLException {
        String sql = ""
                + "UPDATE jogos "
                + "SET "
                + "nome = '" + j.getNome() + "',"
                + "quantidade = '" + j.getQuantidadeEstoque() + "',"
                + "preco = '" + j.getPreco() + "' "
                + "WHERE id = " + j.getId();

        System.out.println("sql: " + sql);

        ConexaoBD.executeUpdate(sql);
    }

    public void excluir(int id) throws SQLException {
        String sql = ""
                + "DELETE FROM jogos WHERE id = " + id;

        System.out.println("sql: " + sql);

        ConexaoBD.executeUpdate(sql);
    }
}

    

