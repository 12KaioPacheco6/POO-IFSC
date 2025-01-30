package MainApp;

import domain.*;
import java.math.BigDecimal;

public class MainApp {

    public static void main(String[] args) {
        Categoria categoria1 = new Categoria();
        categoria1.setId(1);
        categoria1.setDescricao("Instrumento musicais");

        Produto produto1 = new Produto();
        produto1.setId(1);
        produto1.setNome("Piano");
        produto1.setDescricao("Piano de Cauda");
        produto1.setPreco(new BigDecimal(120000));
        produto1.setCategoria(categoria1);

//        Estoque estoque1 = new Estoque();
        produto1.getEstoque().setQtdMaxima(1000);
        produto1.getEstoque().setQtdMinima(10);
        produto1.getEstoque().repor(500);
        produto1.getEstoque().repor(100);
        produto1.getEstoque().setSituacao(ESituacao.ATIVO);
        
        print(produto1);
    }
    //Para garantir a composição o método setEstoque passa a ser indesejável
    
    public static void print(Produto produto) {
        System.out.println("Produto");
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Categoria: " + produto.getCategoria().getDescricao());
        System.out.println("Estoque: " + produto.getEstoque().getQuantidade());
        System.out.println("Situação do Estoque: " +produto.getEstoque().getSituacao());
    }
}
