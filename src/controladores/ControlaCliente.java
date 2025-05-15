/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import entidades.Cliente;
import entidades.DAO.ClienteDAO;
import java.sql.SQLException;
import java.util.ArrayList;


        
public class ControlaCliente {
    
   ClienteDAO clienteDAO = new ClienteDAO();

    public boolean salvar(Cliente c) {
        try {
            clienteDAO.salvar(c);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar cliente: " + ex.getMessage());
            return false;
        }
    }

    public boolean editar(Cliente c){
        try {
            clienteDAO.editar(c);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao editar cliente: " + ex.getMessage());
            return false;
        }
    }
    
    public boolean excluir(int id){
        try {
            clienteDAO.excluir(id);
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir cliente: " + ex.getMessage());
            return false;
        }
    }
    
    public Cliente recuperar(int id){
        try {
            Cliente cliente = clienteDAO.recuperar(id);
            return cliente;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar cliente: " + ex.getMessage());
            return null;
        }
    }
    
    public ArrayList<Cliente> recuperarTodos(){
        ArrayList<Cliente> vetorClientes = null;
        try {
            vetorClientes = clienteDAO.recuperarTodos();
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar clientes: " + ex.getMessage());
        }
        return vetorClientes;
    }
}
