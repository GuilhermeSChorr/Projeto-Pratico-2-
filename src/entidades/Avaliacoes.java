/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author guilherme.schorr
 */
public class Avaliacoes {
    String nome;
    String jogo;
    int nota;
    String comentario;
    int id;

    public Avaliacoes(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Avaliacoes(String nome, String jogo, int nota, String comentario) {
        this.nome = nome;
        this.jogo = jogo;
        this.nota = nota;
        this.comentario = comentario;
    }

    public Avaliacoes() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getJogo() {
        return jogo;
    }

    public void setJogo(String jogo) {
        this.jogo = jogo;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    public void imprimeAtributos(){
        System.out.println(id);
        System.out.println(nome);
        System.out.println(jogo);
        System.out.println(nota);
        System.out.println(comentario);
    }
}
