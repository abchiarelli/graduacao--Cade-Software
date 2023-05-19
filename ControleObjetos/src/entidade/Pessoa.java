/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

/**
 *
 * @author artur
 */
public class Pessoa {
    private int id;
    private String nome;
    private String apelido;
    private String email;
    private String telefone;

    public Pessoa(int id, String nome, String apelido, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.email = email;
        this.telefone = telefone;
    }

    public Pessoa(String nome, String apelido, String email, String telefone) {
        this.nome = nome;
        this.apelido = apelido;
        this.email = email;
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
}
