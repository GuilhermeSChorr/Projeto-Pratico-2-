/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades.DAO;

import apoio.ConexaoBD;
import entidades.Avaliacoes;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author guilherme.schorr
 */
public class AvaliacaoDAO {
  ResultSet resultadoQ = null; // interface que representa o resultado de uma consulta SQL executada em um banco de dados

    public void salvar(Avaliacoes Aval) throws SQLException {

        String sql = ""
                + "INSERT INTO avaliacoes (nome, jogo, nota, coment) VALUES ("
                + "'" + Aval.getNome() + "',"
                + "'" + Aval.getJogo() + "',"
                + "'" + Aval.getNota() + "',"
                + "'" + Aval.getComentario() + "' "
                + ")";

        System.out.println("sql: " + sql);

        ConexaoBD.executeUpdate(sql);

    }

    public ArrayList<Avaliacoes> recuperarTodos() throws SQLException {
        ArrayList<Avaliacoes> avaliacao = new ArrayList();

        String sql = ""
                + "SELECT * FROM avaliacoes ";

        resultadoQ = ConexaoBD.executeQuery(sql);

        while (resultadoQ.next()) {
            Avaliacoes Aval = new Avaliacoes();

            Aval.setId(resultadoQ.getInt("id"));
            Aval.setNome(resultadoQ.getString("nome"));
            Aval.setJogo(resultadoQ.getString("jogo"));
            Aval.setNota(resultadoQ.getInt("nota"));
            Aval.setComentario(resultadoQ.getString("coment"));

            avaliacao.add(Aval);
        }

        return avaliacao;
    }


    public Avaliacoes recuperar(int id) throws SQLException {
        Avaliacoes Aval = null;
        String sql = ""
                + "SELECT * FROM avaliacoes WHERE id = " + id;

        resultadoQ = ConexaoBD.executeQuery(sql);

        while (resultadoQ.next()) {
            Aval = new Avaliacoes();

            Aval.setId(resultadoQ.getInt("id"));
            Aval.setNome(resultadoQ.getString("nome"));
            Aval.setJogo(resultadoQ.getString("jogo"));
            Aval.setNota(resultadoQ.getInt("nota"));
            Aval.setComentario(resultadoQ.getString("coment"));
        }

        return Aval;
    }

    public void editar(Avaliacoes Aval) throws SQLException {
        String sql = ""
                + "UPDATE avaliacoes "
                + "SET "
                + "nome = '" + Aval.getNome() + "',"
                + "jogo = '" + Aval.getJogo() + "',"
                + "nota = " + Aval.getNota() + ","
                + "coment = '" + Aval.getComentario() + "' "
                + "WHERE id = " + Aval.getId();

        System.out.println("sql: " + sql);

        ConexaoBD.executeUpdate(sql);
    }

    public void excluir(int id) throws SQLException {
        String sql = ""
                + "DELETE FROM avaliacoes WHERE id = " + id;

        System.out.println("sql: " + sql);

        ConexaoBD.executeUpdate(sql);
    }
}

