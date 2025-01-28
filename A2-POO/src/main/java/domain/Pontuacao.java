package domain;

public class Pontuacao {
    private int quantidade;
    
    public Pontuacao(){
        this.quantidade = 0;
    }
    
    
    public void adicionar(int quantidade){
        this.quantidade += quantidade;
    }
    
    public void diminuir(int quantidade){
        this.quantidade -= quantidade;
    }
    
    public int saldo(){
        return this.quantidade;
    }
}
