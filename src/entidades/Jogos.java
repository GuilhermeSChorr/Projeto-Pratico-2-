/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author guilherme.schorr
 */
public class Jogos {
    private int id;
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Jogos(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Jogos() {
    }
  public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Jogos(int id) {
        this.id = id;
    }
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    @Override
    public String toString(){
        return id + ";" + nome + ";" + quantidadeEstoque + ";" + preco + ";";
    }
   

    }

  
  


    

