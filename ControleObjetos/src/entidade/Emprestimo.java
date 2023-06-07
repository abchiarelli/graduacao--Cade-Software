/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

import java.time.LocalDate;

/**
 *
 * @author artur
 */
public class Emprestimo {
    private int id;
    private int idObjeto;
    private int idPessoa;
    private int idStatus;
    private String dataEmprestimo;
    private String dataDevolucao;

    public Emprestimo(int idObjeto, int idPessoa, int idStatus, String dataEmprestimo) {
        this.idObjeto = idObjeto;
        this.idPessoa = idPessoa;
        this.idStatus = idStatus;
        this.dataEmprestimo = dataEmprestimo;
    }

    public Emprestimo(int id, int idObjeto, int idPessoa, int idStatus, String dataEmprestimo) {
        this.id = id;
        this.idObjeto = idObjeto;
        this.idPessoa = idPessoa;
        this.idStatus = idStatus;
        this.dataEmprestimo = dataEmprestimo;
    }

    public Emprestimo(int id, int idObjeto, int idPessoa, int idStatus, String dataEmprestimo, String dataDevolucao) {
        this.id = id;
        this.idObjeto = idObjeto;
        this.idPessoa = idPessoa;
        this.idStatus = idStatus;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdObjeto() {
        return idObjeto;
    }

    public void setIdObjeto(int idObjeto) {
        this.idObjeto = idObjeto;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public int getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(int idStatus) {
        this.idStatus = idStatus;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    
}
