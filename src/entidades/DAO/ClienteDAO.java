/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades.DAO;

import apoio.ConexaoBD;
import entidades.Cliente;
import java.util.ArrayList;
import java.sql.*;


/**
 *
 * @author mateus
 */
public class ClienteDAO {
 
   private ResultSet resultadoQ = null; // interface que representa o resultado de uma consulta SQL executada em um banco de dados

    public void salvar(Cliente c) throws SQLException {

        String sql = ""
                + "INSERT INTO cliente (nome, cpf, endereco, datanasc) VALUES ("
                + "'" + c.getNome() + "',"
                + "'" + c.getCpf() + "',"
                + "'" + c.getEndereco() + "',"
                + "'" + c.getDataNasc() + "' "
                + ")";

        System.out.println("sql: " + sql);

        ConexaoBD.executeUpdate(sql);

    }

    public ArrayList<Cliente> recuperarTodos() throws SQLException {
        ArrayList<Cliente> clientes = new ArrayList();

        String sql = ""
                + "SELECT * FROM cliente ";

        resultadoQ = ConexaoBD.executeQuery(sql);

        while (resultadoQ.next()) {
            Cliente cliente = new Cliente();

            cliente.setId(resultadoQ.getInt("id"));
            cliente.setNome(resultadoQ.getString("nome"));
            cliente.setCpf(resultadoQ.getString("cpf"));
            cliente.setEndereco(resultadoQ.getString("endereco"));
            cliente.setDataNasc(resultadoQ.getString("datanasc"));

            clientes.add(cliente);
        }

        return clientes;
    }

    public Cliente recuperar(int id) throws SQLException {
     Cliente cliente = null;
        String sql = ""
                + "SELECT * FROM cliente WHERE id = " + id;

        resultadoQ = ConexaoBD.executeQuery(sql);

        if (resultadoQ.next()) {
            cliente = new Cliente();

            cliente.setId(resultadoQ.getInt("id"));
            cliente.setNome(resultadoQ.getString("nome"));
            cliente.setCpf(resultadoQ.getString("cpf"));
            cliente.setEndereco(resultadoQ.getString("endereco"));
            cliente.setDataNasc(resultadoQ.getString("datanasc"));
        }

        return cliente;
    }

    public void editar(Cliente c) throws SQLException {
        String sql = ""
                + "UPDATE cliente "
                + "SET "
                + "nome = '" + c.getNome() + "',"
                + "endereco = '" + c.getEndereco() + "',"
                + "datanasc = '" + c.getDataNasc() + "',"
                + "cpf = '" + c.getCpf() + "' "
                + "WHERE id = " + c.getId();

        System.out.println("sql: " + sql);

        ConexaoBD.executeUpdate(sql);
    }

    public void excluir(int id) throws SQLException {
        String sql = ""
                + "DELETE FROM cliente WHERE id = " + id;

        System.out.println("sql: " + sql);

        ConexaoBD.executeUpdate(sql);
    }
}