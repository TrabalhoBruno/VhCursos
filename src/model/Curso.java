/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;



import java.sql.Time;
/**
 *
 * @author 201811640024
 */
public class Curso {
     private int idCurso;
    private String nome;
    private String codigo;
    private String area;
    private String cargaHoraria;
    private String HorarioAula;
    private float ValorCurso;
    private float ValorMensalidade;
    private int NumeroVagas;

   
    public int getIdCurso() {
        return idCurso;
    }

   
    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

   
    public String getNome() {
        return nome;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public String getCodigo() {
        return codigo;
    }

   
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

   
    public String getArea() {
        return area;
    }

   
    public void setArea(String area) {
        this.area = area;
    }

   
    public String getCargaHoraria() {
        return cargaHoraria;
    }

   
    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

   
    public String getHorarioAula() {
        return HorarioAula;
    }

   
    public void setHorarioAula(String HorarioAula) {
        this.HorarioAula = HorarioAula;
    }

   
    public float getValorCurso() {
        return ValorCurso;
    }

   
    public void setValorCurso(float ValorCurso) {
        this.ValorCurso = ValorCurso;
    }

   
    public float getValorMensalidade() {
        return ValorMensalidade;
    }

   
    public void setValorMensalidade(float ValorMensalidade) {
        this.ValorMensalidade = ValorMensalidade;
    }

   
    public int getNumeroVagas() {
        return NumeroVagas;
    }

   
    public void setNumeroVagas(int NumeroVagas) {
        this.NumeroVagas = NumeroVagas;
    }
}
