/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

/**
 *
 * @author artur
 */
public class Status {
    private int id;
    private String descricao;
    private char tipo;

    public Status(int id, String descricao, char tipo) {
        this.id = id;
        this.descricao = descricao;
        this.tipo = tipo;
    }

    public Status(String descricao, char tipo) {
        this.descricao = descricao;
        this.tipo = tipo;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
    
    
}
