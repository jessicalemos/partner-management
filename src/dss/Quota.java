/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dss;

import java.time.LocalDate;

/**
 *
 * @author
 */
public class Quota {
    private double valor;
    private LocalDate data;
    
    public Quota(){
        this.valor = 0;
        this.data = LocalDate.now();
    }
    
    public Quota(double valor, LocalDate data){
        this.valor = valor;
        this.data = data;
    }
    
    public Quota(Quota q){
        this.valor = q.getValor();
        this.data = q.getData();
    }
    
    public double getValor(){
        return this.valor;
    }
    
    public LocalDate getData(){
        return this.data;
    }
    
    public void setValor(int valor){
        this.valor = valor;
    }
    
    public void setData(LocalDate data){
        this.data = data;
    }
    
    public boolean equals(Object o) {
        boolean b=false;

        if (o!= null && o instanceof Aluno) {
            Quota a = (Quota)o;
            b = this.data.equals(a.getData()) &&
                this.valor == a.getValor();
        }
        return b;
    }
    
    public Object clone() {
        return new Quota(this);
    }
    
    public String toString() {
        StringBuffer sb = new StringBuffer("Quota(");
        sb.append(this.data);
        sb.append(",");
        sb.append(this.valor);
        sb.append(")");
        return sb.toString();
    }
}
