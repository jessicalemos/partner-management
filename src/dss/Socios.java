/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dss;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author
 */
public class Socios {
    private Map<Integer,Aluno> socios;
    
    public Socios() {
        this.socios = new HashMap<Integer,Aluno>();
    }

    public Map<Integer,Aluno> getSocios(){
        return this.socios.entrySet().stream().collect(Collectors.toMap(e->e.getKey(), e->e.getValue()));
    }
    
    public Aluno getAluno(int num){
        return this.socios.get(num);
    }
   
   public void setAluno(int numero, Aluno a){
       this.socios.replace(numero,a);
   }

    public void addAluno(Aluno a){
        this.socios.put(a.getNumero(),a);
    }
}
