package domain;

public abstract class Cliente{
    protected int id;
    protected String nome;
    protected String celular;
    protected String email;
    protected String dtCadastro;
    
    private Pontuacao pontuacao = new Pontuacao();
    
    public Cliente() {
        this.id = 0;
        this.nome = null;
        this.celular = null;
        this.email = null;
        this.dtCadastro = null;
    }
    
    public Cliente(int id, String nome, int quantidade, String celular, String email, String dtcadastro){
        this.id = id;
        this.nome = nome;
        this.celular = celular;
        this.email = email;
        this.dtCadastro = dtcadastro; 
        this.pontuacao = new Pontuacao();  
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDtcadastro() {
        return dtCadastro;
    }

    public void setDtcadastro(String dtcadastro) {
        this.dtCadastro = dtcadastro;
    }
    
    public Pontuacao getPontuacao(){
        return this.pontuacao;
    } 

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome=" + nome + ", celular=" + celular + ", email=" + email + ", dtCadastro=" + dtCadastro + ", pontuacao=" + pontuacao + '}';
    }
    
    
    
    
}
