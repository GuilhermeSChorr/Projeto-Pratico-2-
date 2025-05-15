/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author mateus
 */
public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private String endereco;
    private String dataNasc;

    public Cliente() {
    }

    public Cliente(int id, String nome, String cpf, String endereco, String dataNasc) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.dataNasc = dataNasc;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    public void imprimeAtributos(){
        System.out.println(id);
        System.out.println(nome);
        System.out.println(cpf);
        System.out.println(endereco);
        System.out.println(dataNasc);
    }
    @Override
    public String toString(){
        return id + ";" + nome + ";" + cpf + ";" + endereco + ";" + dataNasc;
    }
}
