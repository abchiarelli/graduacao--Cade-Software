/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

/**
 *
 * @author artur
 */
public class Objeto {
    private int id;
    private String titulo;
    private String autor;
    private String publisher;
    private int status;
    private int tipo;

    public Objeto(int id, String titulo, String autor, String publisher, int status, int tipo) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.publisher = publisher;
        this.status = status;
        this.tipo = tipo;
    }

    public Objeto(String titulo, String autor, String publisher, int status, int tipo) {
        this.titulo = titulo;
        this.autor = autor;
        this.publisher = publisher;
        this.status = status;
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    
    
    
}
