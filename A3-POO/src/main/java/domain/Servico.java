package domain;

import java.util.ArrayList;
import java.util.List;

public class Servico {
    private static int id;
    private String descricao;
    private double valor;
    private static int pontos;


    private ECategoria categoria = ECategoria.MEDIO;
    private List<ItemOS> itens = new ArrayList<>();

    public Servico(int id, String descricao, double valor, ECategoria categoria) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public static int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        valor = calcarServico();
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public static int getPontos() {
        Servico.pontos += Servico.pontos;
        return Servico.pontos;
    }

    public static void setPontos(int pontos) {
        Servico.pontos = pontos;
    }

    public ECategoria getCategoria() {
        return categoria;
    }

    public void setCategoria(ECategoria categoria) {
        this.categoria = categoria;
    }

    public List<ItemOS> getItens() {
        return itens;
    }

    public double calcarServico() {
        for (ItemOS intensOS : itens){
            valor += intensOS.getValor();
        }
        return valor;
    }

    public void add(ItemOS itemOS) {
        itens.add(itemOS);
        itemOS.setServico(this);
    }

    public void remove(ItemOS itemOS) {
        itens.remove(itemOS);
        itemOS.setServico(null);
    }

//    public String imprimirOS(){
//        StringBuilder imprimir = new StringBuilder();
//        imprimir.append("\n\n");
//        imprimir.append(" *********** ITENS - SERVIÇO *********").append("\n");
//        imprimir.append("\n\n");
//        imprimir.append("ID \t\t\t Ordem de Serviço \t\t Veiculo \t\t\t Agenda \t\t\t Status \t\t\t").append("\n");
//        for(ItemOS itemOS : itens) {
//            imprimir.append(itemOS.getOrdemServico().getNumero()).append("\t\t\t")
//                    .append(itemOS.getServico().getDescricao()).append("\t\t").append(itemOS.getOrdemServico().getVeiculo().getID())
//                    .append("\t\t\t").append(itemOS.getOrdemServico().getAgenda()).append("\t\t\t")
//                    .append(itemOS.getOrdemServico().getStatus());
//
//            imprimir.append("\nPontos: ").append(Servico.pontos);
//            imprimir.append("\nObservação: ").append(itemOS.getObservacao()).append("\n");
//            imprimir.append("\nValor: ").append(itemOS.getServico().getValor());
//
//        }
//        imprimir.append("\n\n");
//        imprimir.append("\tObrigado pela Preferência\t");
//        return imprimir.toString();
//    }
}
