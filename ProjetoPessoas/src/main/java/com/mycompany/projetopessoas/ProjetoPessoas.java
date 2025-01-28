/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetopessoas;


public class ProjetoPessoas {

    public static void main(String[] args) {
        Aluno p1 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        Funcionario p6 = new Funcionario();
        
        
        p1.setNome("Pedro");
        p3.setNome("Claúdio");
        p4.setNome("Lucas");
        
        p1.setSexo("M");
        
        p1.setCurso("Informática");
        p3.setSalario(1500.75f);
        p4.setSetor("Estoque");
        
        
        Print(p1);
        Print(p3);
        Print(p4);
    }
    
    public static void Print(Pessoa pessoa){
        System.out.println(pessoa.toString());
        
    }
    
}
