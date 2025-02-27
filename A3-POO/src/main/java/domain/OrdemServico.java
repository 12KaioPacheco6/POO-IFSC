package domain;

public class OrdemServico {
    private long numero;
    private double total;
    private String agenda;
    private double desconto;
    private Veiculo veiculo;

    private EStatus status = EStatus.ABERTA;

    public OrdemServico(Veiculo veiculo, long numero, double total, String agenda, double desconto, EStatus status) {
        this.veiculo = veiculo;
        this.numero = numero;
        this.total = total;
        this.agenda = agenda;
        this.desconto = desconto;
    }

    public String getAgenda() {
        return agenda;
    }

    public void setAgenda(String agenda) {
        this.agenda = agenda;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public EStatus getStatus() {
        return status;
    }

    public void setStatus(EStatus status) {
        this.status = status;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }


}
