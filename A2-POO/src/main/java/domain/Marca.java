package domain;


public class Marca {
    private int id;
    private String nome;
    
    public Marca(){
        this.id = 0;
        this.nome = null;
    }    

    public Marca(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
    public void setID(int id){
        this.id = id;
    }
    
    public int getID() {
        return id;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
}
