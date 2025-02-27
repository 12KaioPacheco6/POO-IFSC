package domain;


public class PessoaFisica extends Cliente {
    private String cpf;
    private String dtnascimento;
        
    public PessoaFisica(int id, String nome, String cpf, String dtnascimento, String celular, String email, String dtcadastro){
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dtnascimento = dtnascimento;
        this.celular = celular;
        this.email = email;
        this.dtCadastro = dtcadastro;
    }
    
    public PessoaFisica(){
        this.cpf = null;
        this.dtnascimento = null;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDtnascimento() {
        return dtnascimento;
    }

    public void setDtnascimento(String dtnascimento) {
        this.dtnascimento = dtnascimento;
    }

    @Override
    public String getDados(){
        StringBuilder dados = new StringBuilder();
        dados.append(super.getDados());
        dados.append("CPF: -------------------").append(this.cpf).append("\n");
        dados.append("Data de Nascimento: ---------------- ").append(this.dtnascimento).append("\n");
        return dados.toString();
    }
    @Override
    public String getDados(String observacao){
        StringBuilder dados = new StringBuilder();
        dados.append(getDados()).append("\n").append("Mensagem: ").append(observacao);
        return dados.toString();
    }
}
