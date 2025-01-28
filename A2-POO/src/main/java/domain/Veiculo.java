package domain;

public class Veiculo {
    private int id;
    private String descricao;
    Modelo modelo;
    Cor cor;
    
    public Veiculo(){
        this.id = 0;
        this.descricao = null;
        this.modelo = null;
        this.cor = null;
    }
    
    public Veiculo(int id, String descricao, Modelo modelo, Cor cor){
        this.id = id;
        this.descricao = descricao;
        this.modelo = modelo;
        this.cor = cor;
    }
    
    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }
    

    public void setID(int id) {
        this.id = id;
    }
    
    public int getID() {
        return id;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public void setModelo(Modelo modelo){
        this.modelo = modelo;
    }
    
    public Modelo getModelo(){
        return modelo;
    }
    
}
