
package MainApp;

import domain.Cliente;
import domain.Cor;
import domain.ECategoria;
import domain.EStatus;
import domain.ETipoCombustivel;
import domain.ItemOS;
import domain.Marca;
import domain.Modelo;
import domain.OrdemServico;
import domain.PessoaFisica;
import domain.PessoaJuridica;
import domain.Servico;
import domain.Veiculo;
import report.ImpressaoOS;
import report.Relatorio;

public class MainApp {
    public static void main(String[] args) {
                               // ====== CRIAÇÃO DE MARCAS ======
                Marca marc1 = new Marca(10, "Ford");
                Marca marc2 = new Marca(11, "Fiat");
                Marca marc3 = new Marca(12, "Chevrolet");
                Marca marc4 = new Marca(13, "Toyota");
                Marca marc5 = new Marca(14, "Honda");

        // ====== CRIAÇÃO DE CORES ======
                Cor cor1 = new Cor("Vermelho", 10);
                Cor cor2 = new Cor("Preto", 11);
                Cor cor3 = new Cor("Branco", 12);
                Cor cor4 = new Cor("Azul", 13);
                Cor cor5 = new Cor("Prata", 14);

        // ====== CRIAÇÃO DE MODELOS ======
                Modelo mod1 = new Modelo(20, "Ranger", marc1, 100, ECategoria.GRANDE, ETipoCombustivel.GNV);
                Modelo mod2 = new Modelo(21, "Toro", marc2, 101, ECategoria.MEDIO, ETipoCombustivel.FLEX);
                Modelo mod3 = new Modelo(22, "Onix", marc3, 102, ECategoria.PEQUENO, ETipoCombustivel.GASOLINA);
                Modelo mod4 = new Modelo(23, "Corolla", marc4, 103, ECategoria.GRANDE, ETipoCombustivel.OUTRO);
                Modelo mod5 = new Modelo(24, "Civic Type R", marc5, 104, ECategoria.PADRAO, ETipoCombustivel.GASOLINA);

        // ====== CRIAÇÃO DE VEÍCULOS ======
                Veiculo veic1 = new Veiculo(30, "Picape robusta, excelente para carga pesada.", mod1, cor1);
                Veiculo veic2 = new Veiculo(31, "SUV confortável, ideal para viagens longas.", mod2, cor2);
                Veiculo veic3 = new Veiculo(32, "Hatch compacto, econômico e prático.", mod3, cor3);
                Veiculo veic4 = new Veiculo(33, "Sedan sofisticado, tecnologia híbrida avançada.", mod4, cor4);
                Veiculo veic5 = new Veiculo(34, "Esportivo de alta performance e design aerodinâmico.", mod5, cor5);

        // ====== CRIAÇÃO DE PESSOAS FÍSICAS ======
                PessoaFisica pf1 = new PessoaFisica(1, "Nina", "025.125.458-86", "24/06/2003", "95 96664558", "nina@gmail.com", "12/12/2025");
                PessoaFisica pf2 = new PessoaFisica(2, "Francine", "0125.457.856-47", "18/08/2004", "91 986547586", "francine@gmail.com", "24/01/2024");
                PessoaFisica pf3 = new PessoaFisica(3, "Kaio", "930.567.903-09", "12/07/2005", "91 9857-0945", "kaio.p@aluno.ifsc.edu.br", "24/08/2024");
                PessoaFisica pf4 = new PessoaFisica(4, "Carlos", "478.325.965-02", "05/05/1999", "91 977654321", "carlos99@email.com", "15/06/2026");
                PessoaFisica pf5 = new PessoaFisica(5, "Juliana", "321.654.987-11", "30/03/2001", "95 999888777", "juliana@gmail.com", "10/11/2025");

        // ====== CRIAÇÃO DE PESSOAS JURÍDICAS ======
                PessoaJuridica pj1 = new PessoaJuridica(1, "Pessoalize", "95 998452578", "pessoalize@hotmail.com", "12/06/2021",
                        "1457.00001.5879-96", "02/06/2024");
                PessoaJuridica pj2 = new PessoaJuridica(2, "CS FROTAS", "95 998454789", "cs.frotas@email.com", "25/04/2023",
                        "1457.00001.523689-96", "19/08/2020");
                PessoaJuridica pj3 = new PessoaJuridica(3, "HREBOS", "95 993023953", "hrebos@icloud.com", "23/07/2023",
                        "1232.000004.5364334-0", "31/09/2019");
                PessoaJuridica pj4 = new PessoaJuridica(4, "AutoCar", "95 995002341", "autocar@email.com", "10/02/2022",
                        "1547.00002.789654-32", "22/10/2025");
                PessoaJuridica pj5 = new PessoaJuridica(5, "SpeedWash", "95 997845321", "speedwash@empresa.com", "05/09/2020",
                        "1789.00004.563210-11", "15/03/2024");

        // ====== CRIAÇÃO DE SERVIÇOS ======
                Servico serv1 = new Servico(1, "Lavação Interna", 100.00,  ECategoria.PADRAO);
                Servico serv2 = new Servico(2, "Lavação Externa", 80.00,  ECategoria.MEDIO);
                Servico serv3 = new Servico(3, "Polimento", 150.00,  ECategoria.GRANDE);
                Servico serv4 = new Servico(4, "Higienização Completa", 200.00,  ECategoria.PEQUENO);
                Servico serv5 = new Servico(5, "Enceramento", 120.00, ECategoria.MOTO);


        // ====== CRIAÇÃO DE ORDENS DE SERVIÇO ======
                OrdemServico os1 = new OrdemServico(veic1,1, 150.00, "02/02/2024", 150.0, EStatus.ABERTA);
                OrdemServico os2 = new OrdemServico(veic2,2, 230.00, "05/02/2024", 100.00, EStatus.FECHADA);
                OrdemServico os3 = new OrdemServico(veic5,3, 200.00, "07/02/2024", 50.0, EStatus.CANCELADA);
                OrdemServico os4 = new OrdemServico(veic3,4, 100.00, "10/02/2024", 40.50, EStatus.ABERTA);
                OrdemServico os5 = new OrdemServico(veic4,5, 180.00, "12/02/2024", 55.0, EStatus.FECHADA);

        // ====== CRIAÇÃO DE ITENS DE ORDEM DE SERVIÇO ======
                ItemOS item1 = new ItemOS(os1, 200.0, "Foi encontrada uma chave dentro do carro");
                ItemOS item2 = new ItemOS(os2, serv3.getValor(), "Polimento realizado com sucesso");
                ItemOS item3 = new ItemOS(os3, serv4.getValor(), "Higienização completa, removidos manchas e odores");
                ItemOS item4 = new ItemOS(os4, serv2.getValor(), "Lavação externa concluída, sem resíduos de sujeira");
                ItemOS item5 = new ItemOS(os5, serv5.getValor(), "Enceramento premium finalizado com alto brilho");


        //Add Serviço a cliente
        serv1.add(item5);
        serv3.add(item4);
        serv2.add(item1);
        serv3.add(item2);
        serv4.add(item3);
        serv5.add(item4);

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
        pj3.add(veic1);
        pj1.add(veic3);
        pf2.add(veic4);
        pf5.add(veic5);


        //método para imprimir os dados de PJ
        print(pj1);
        print(pj2);
        print(pj3);
        //método para imprimir os dados de PF
        print(pf1);
        print(pf2);
        print(pf3);
        //método que chama para para imprimir os dados do Veiculo
        print(serv1);
        print(serv2);
        print(serv3);
        print(serv4);
        print(serv5);

    }


    public static void print(Cliente cliente){
        System.out.println(Relatorio.imprimirRelatorio(cliente));
    }

    public static void print(Servico servico){
        Servico.setPontos(10);
        System.out.println(ImpressaoOS.imprimirOS(servico));
    }
}


