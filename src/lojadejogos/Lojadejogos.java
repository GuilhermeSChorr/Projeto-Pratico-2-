/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lojadejogos;

import apoio.ConexaoBD;
import entidades.Jogos;
import javax.swing.JOptionPane;
import telas.TelaPrincipal;

/**
 *
 * @author guilherme.schorr
 */
public class Lojadejogos {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        try {
            ConexaoBD.getInstance().getConnection();
            TelaPrincipal tp = new TelaPrincipal();
            tp.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Erro de conexão com o banco de dados!\nPor favor entre em contato com o suporte.");
        } finally {
            ConexaoBD.getInstance().shutdown();
        }

    }
 
 
}   
    

