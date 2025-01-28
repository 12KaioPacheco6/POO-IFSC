
package com.mycompany.projetopessoas;

public class Professor extends Pessoa{
    private String especialidade;
    private float salario;
    
    public Professor(){
        this.especialidade = null;
        this.salario = 0;
    }
    
    public Professor(String especialidade, float salario){
        this.especialidade = especialidade;
        this.salario = salario;
    }
            
    public void receberSalario(float aum){
        salario += aum;
    }
    
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
