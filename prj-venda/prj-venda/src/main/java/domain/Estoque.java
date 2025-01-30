package domain;

public class Estoque {
    private int quantidade;
    private int qtdMaxima;
    private int qtdMinima;
    
    private ESituacao situacao = ESituacao.ATIVO;
    
    public int getQtdMaxima() {
        return qtdMaxima;
    }

    public void setQtdMaxima(int qtdMaxima) {
        this.qtdMaxima = qtdMaxima;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public ESituacao getSituacao() {
        return situacao;
    }

    public void setSituacao(ESituacao situacao) {
        this.situacao = situacao;
    }
        
    public void repor(int qtd){
        if(qtd + this.quantidade <= this.qtdMaxima){
            this.quantidade += qtd;
        }
    }
    
    public void retirar(int qtd){
        if ( qtd <= this.quantidade) {
            this.quantidade -= qtd;
        }
    }
}
