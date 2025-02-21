
package domain;

public class PessoaJuridica extends Cliente{
    private String cnpj;
    private String inscricaoEstadual;  
    
    public PessoaJuridica(int id, String nome, String celular, String email, String dtcadastro, String cnpj, String inscricaoEstudual){
        this.id = id;
        this.nome = nome;
        this.celular = celular;
        this.email = email;
        this.dtCadastro = dtcadastro; 
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstudual;
    }
    
    public PessoaJuridica(){
        this.cnpj = null;
        this.inscricaoEstadual = null;
    }
    
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    
    public String getCnpj(){
        return cnpj;
    }
    
    public void setInscricaoEstadual(String inscricaoEstadual){
        this.inscricaoEstadual = inscricaoEstadual;
    }
    
    public String getInscricaoEstadual(){
        return inscricaoEstadual;
    }

    @Override
    public String getDados(){
        StringBuilder dados = new StringBuilder();
        dados.append("CNPJ: -------------------- ").append(this.getCnpj()).append("\n");
        dados.append("Inscrição Estadual: -------------------- ").append(this.getInscricaoEstadual()).append("\n");
        return toString();
    }
}