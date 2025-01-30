
package MainApp;

import domain.Cor;
import domain.ECategoria;
import domain.ETipoCombustivel;
import domain.Marca;
import domain.Modelo;
import domain.PessoaFisica;
import domain.PessoaJuridica;
import domain.Veiculo;

public class MainApp {
    public static void main(String[] args) {
        //criação de marca 
        Marca marc1 = new Marca(10, "Ford");
        Marca marc2 = new Marca(11, "Fiat");
        //criação de cor
        Cor cor1 = new Cor("Vermelho", 10);
        Cor cor2 = new Cor("Preto", 11);
        //criação dos objetos modelos
        Modelo mod1 = new Modelo(20,"Picapes", marc1, 100, ECategoria.PADRAO, ETipoCombustivel.GASOLINA);
        Modelo mod2 = new Modelo(21, "SUV", marc2, 101,ECategoria.MEDIO, ETipoCombustivel.ETANOL);
        //criação dos obejtos veiculos
        Veiculo veic1 = new Veiculo(30, "Grande com couro marron nos bancos e tapetes.", mod2, cor1);
        Veiculo veic2 = new Veiculo(31, "Médio com couro preto nos bancos.", mod1, cor2);
         
        //criação de pessoa física
        PessoaFisica pf1 = new PessoaFisica(1,"Nina", "025.125.458-86", "24/06/2003","95 96664558", "nina@gmail.com", "24/12/2023");
        PessoaFisica pf2 = new PessoaFisica(2, "Francine", "0125.457.856-47", "18/08/2004", "91 986547586", "francine@gmail.com", "24/01/2024");
        PessoaFisica pf3 = new PessoaFisica(3, "Kaio", "930.567.903-09", "12/07/2005", "91 9857-0945", "kaio.p@aluno.ifsc.edu.br", "24/08/2024");
        
        //criação de pessoa juridica
        PessoaJuridica pj1 = new PessoaJuridica(1,"Pessoalize","95 998452578", "pessoalize@hotemail.com", "12/06/2021",
        "1457.00001.5879-96","02/06/2024");
        PessoaJuridica pj2 = new PessoaJuridica(2,"CS FROTAS ","95 998454789", "cs.frotas@email.com", "25/04/2023",
        "1457.00001.523689-96", "19/08/2020");
        PessoaJuridica pj3 = new PessoaJuridica(3, "HREBOS", "95 993023953", "hrebos@icloud.com", "23/07/2023", 
        "1232.000004.5364334-0", "31/09/2019");

        pj2.getDados("Cliente está com uma dívida de R$5.00,00 reias com a empresam");
        pf1.getDados("Cliente com processo na Justiça contra a empresa. Deve ser cuidadosos com os dados compartilhados com po cliente.");

        //aumentar pontuação - pessoa física 
        pf1.getPontuacao().adicionar(6);
        pf2.getPontuacao().adicionar(30);
        pf3.getPontuacao().adicionar(5);
        pf2.getPontuacao().adicionar(25);

        //Diminuir Pessoa Fisica 
        pf2.getPontuacao().diminuir(3);
        pf1.getPontuacao().diminuir(10);
        pf3.getPontuacao().diminuir(6);

        //aumentar a pontuação - pessoa jurídica
        pj1.getPontuacao().adicionar(12);
        pj2.getPontuacao().adicionar(34);
        pj3.getPontuacao().adicionar(23);

        //diminuir a pontuação - pessoa jurídica
        pj1.getPontuacao().diminuir(3);
        pj2.getPontuacao().diminuir(12);
        pj3.getPontuacao().diminuir(14);

        //medoto pra adicionar as veiculos dos clientes
        pf1.add(veic2);
        pj3.add(veic2);


        //método para imprimir os dados de PJ
        print(pj1);
        print(pj2);
        print(pj3);
        //método para imprimir os dados de PF
        print(pf1);
        print(pf2);
        print(pf3);
        //método para imprimir os dados do Veiculo
        print (veic1);
        print(veic2);
    }

    
    public static void print(Veiculo veiculo){
        System.out.print("\nInformaões Carros\n\n");
        System.out.println("ID:-------------------" 
                + veiculo.getID());
        System.out.println("Modelo:-------------------" 
                +veiculo.getModelo().getMarca().getNome());
        System.out.println("Motor Potência:-------------------" 
                +veiculo.getModelo().getMotor().getPotencia());
        System.out.println("Tipo de Combustível:-------------------" 
                +veiculo.getModelo().getMotor().getCombustivel().getCombustivel());
        System.out.println("Categoria:-------------------" 
                +veiculo.getModelo().getCategoria().getDescricao());
        System.out.println("Cor:-------------------" + veiculo.getCor().getCor());
        System.out.println("Descição:-------------------" + veiculo.getDescricao());
    }
    
    public static void print(PessoaFisica cliente){
        System.out.println("\nDados do Cliente - PF\n");
        System.out.println("ID: ---------------" + cliente.getId());
        System.out.println("Nome: ---------------" + cliente.getNome());
        System.out.println("CPF: ---------------" + cliente.getCpf());
        System.out.println("Data de Nacimento: ---------------" + cliente.getDtnascimento());
        System.out.println("Celular: ---------------" + cliente.getCelular());
        System.out.println("E-mail: ---------------" + cliente.getEmail());
        System.out.println("Pontuacao: ---------------" + cliente.getPontuacao().saldo());
        System.out.println("Data de Cadastro: ---------------" + cliente.getDtcadastro());
        System.out.println("Dados dos Clinte - PF:-------------------" + cliente.getDados());
        System.out.println("Veiculos do CLiente:-------------------");
    }
    
    public static void print(PessoaJuridica cliente){
        System.out.println("\nDados do Cliente - PJ \n");
        System.out.println("ID: ---------------" + cliente.getId());
        System.out.println("Nome: ---------------" + cliente.getNome());
        System.out.println("CPF: ---------------" + cliente.getCnpj());
        System.out.println("Data de Inscrição:---------------" + cliente.getInscricaoEstadual());
        System.out.println("Celular: ---------------" + cliente.getCelular());
        System.out.println("E-mail: ---------------" + cliente.getEmail());
        System.out.println("Pontuacao: ---------------" + cliente.getPontuacao().saldo());
        System.out.println("Data de Cadastro: ---------------" + cliente.getDtcadastro());
        System.out.println("Dados dos Clinte - PJ:-------------------" + cliente.getDados());
        System.out.println("Veiculos do CLiente:-------------------" + cliente.getVeiculo());
    }
    
}
