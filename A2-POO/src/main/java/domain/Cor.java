package domain;

public class Cor {
    private int id;
    private String cor;
    
    public Cor(){
        this.id = 0;
        this.cor = null;
    }
    
    public Cor(String cor, int id){
        this.cor = cor;
        this.id = id;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
}
