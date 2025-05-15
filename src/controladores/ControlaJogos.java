/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;
import entidades.DAO.JogosDAO;
import entidades.Jogos;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author guilherme.schorr
 */
public class ControlaJogos {
    
   JogosDAO jogosDAO = new JogosDAO();

    public boolean salvar(Jogos j) {
        try {
            jogosDAO.salvar(j);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar jogo: " + ex.getMessage());
            return false;
        }
    }

    public boolean editar(Jogos j){
        try {
            jogosDAO.editar(j);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao editar jogo: " + ex.getMessage());
            return false;
        }
    }
    
    public boolean excluir(int id){
        try {
            jogosDAO.excluir(id);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir jogo: " + ex.getMessage());
            return false;
        }
    }
    
    public Jogos recuperar(int id){
        try {
          Jogos jogos = jogosDAO.recuperar(id);
            return jogos;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar jogo: " + ex.getMessage());
            return null;
        }
    }
    
    public ArrayList<Jogos> recuperarTodos(){
        ArrayList<Jogos> vetorJogos = null;
        try {
            vetorJogos = jogosDAO.recuperarTodos();
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar jogos: " + ex.getMessage());
        }
        return vetorJogos;
    }
}
    

