
package com.mycompany.projetopessoas;

public class Aluno extends Pessoa {
    private int matr;
    private String curso;
    
    public Aluno(int matr, String curso){
        this.matr = matr;
        this.curso = curso; 
    }
    
    public Aluno(){
        this.matr = 0;
        this.curso = null;
    }
            
    public void cancelarMatr(){
        System.out.println("Matricula Cancelada");
    }
    
    

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
