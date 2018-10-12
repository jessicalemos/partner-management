/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dss;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toMap;

/**
 *
 * @author
 */
public class Aluno {
    private String nome;
    private int numero;
    private String curso;
    private int ano;
    private String morada;
    private List<Quota> quotas;
    
    public Aluno() {
        this.nome = "";
        this.numero = 0;
        this.curso = "";
        this.ano = 0;
        this.morada = "";
        this.quotas = new ArrayList<Quota>();
    }
    
    public Aluno(String nome, int numero, String curso, int ano, String morada, List<Quota> quotas){
        this.nome = nome;
        this.numero = numero;
        this.curso = curso;
        this.ano = ano;
        this.morada = morada;
        this.quotas = new ArrayList<Quota>();
        if (quotas != null) this.quotas = quotas.stream().collect(Collectors.toList());
    }
    
    public Aluno(Aluno a){
        this.nome = a.getNome();
        this.numero = a.getNumero();
        this.curso = a.getCurso();
        this.ano = a.getAno();
        this.morada = a.getMorada();
        this.quotas = a.getQuotas();
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public String getCurso(){
        return this.curso;
    }
    
    public int getAno(){
        return this.ano;
    }
    
    public String getMorada(){
        return this.morada;
    }
    
    public List<Quota> getQuotas(){
        return this.quotas.stream().collect(Collectors.toList());
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public void setCurso(String curso){
        this.curso = curso;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public void setMorada(String morada){
        this.morada = morada;
    }
   
    public void addQuota(Quota q){
        this.quotas.add(q);
    }
 
    public boolean equals(Object o) {
        boolean b=false;

        if (o!= null && o instanceof Aluno) {
            Aluno a = (Aluno)o;
            b = this.curso.equals(a.getCurso()) &&
                this.nome.equals(a.getNome()) &&
                this.morada.equals(a.getMorada()) &&
                this.numero == a.getNumero() &&
                this.ano == a.getAno();
        }
        return b;
    }
    
    public Object clone() {
        return new Aluno(this);
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("Aluno(");
        sb.append(this.nome);
        sb.append(",");
        sb.append(this.numero);
        sb.append(",");
        sb.append(this.curso);
        sb.append(",");
        sb.append(this.ano);
        sb.append(",");
        sb.append(this.morada);
        sb.append(")");
        return sb.toString();
    }
}
