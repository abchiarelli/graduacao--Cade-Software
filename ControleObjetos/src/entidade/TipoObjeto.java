/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

/**
 *
 * @author artur
 */
public class TipoObjeto {
    private int id;
    private String descricao;

    public TipoObjeto(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public TipoObjeto(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }
    
}
