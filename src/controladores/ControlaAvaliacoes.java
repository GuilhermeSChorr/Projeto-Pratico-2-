/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import entidades.Avaliacoes;
import entidades.DAO.AvaliacaoDAO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author guilherme.schorr
 */
public class ControlaAvaliacoes {
     AvaliacaoDAO avaliacaoDAO = new AvaliacaoDAO();

public boolean salvar(Avaliacoes Aval) {
        try {
            avaliacaoDAO.salvar(Aval);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar cliente: " + ex.getMessage());
            return false;
        }
    }

    public boolean editar(Avaliacoes Aval){
        try {
            avaliacaoDAO.editar(Aval);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao editar cliente: " + ex.getMessage());
            return false;
        }
    }
    
    public boolean excluir(int id){
        try {
            avaliacaoDAO.excluir(id);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir cliente: " + ex.getMessage());
            return false;
        }
    }
    
    public Avaliacoes recuperar(int id){
        try {
            Avaliacoes Aval = avaliacaoDAO.recuperar(id);
            return Aval;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar cliente: " + ex.getMessage());
            return null;
        }
    }
    
    public ArrayList<Avaliacoes> recuperarTodos(){
        ArrayList<Avaliacoes> vetorAvaliacoes = null;
        try {
            vetorAvaliacoes = avaliacaoDAO.recuperarTodos();
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar clientes: " + ex.getMessage());
        }
        return vetorAvaliacoes;
    }

}
