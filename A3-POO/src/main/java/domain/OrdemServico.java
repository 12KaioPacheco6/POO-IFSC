package domain;

import java.util.Date;

public class OrdemServico {
    private long numero;
    private double total;
    private Date agenda;
    private double desconto;

    private EStatus status = EStatus.ABERTA;
    private Servico servico = new Servico();

    public OrdemServico() {
        this.numero = 0;
        this.total = 0;
        this.agenda = null;
        this.desconto = 0;
        this.desconto = 0;
    }

    public OrdemServico(long numero, double total, Date agenda, double desconto) {
        this.servico = new Servico();
        this.numero = numero;
        this.total = total;
        this.agenda = agenda;
        this.desconto = desconto;

    }

    public Date getAgenda() {
        return agenda;
    }

    public void setAgenda(Date agenda) {
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

    public Servico getServico() {
        return servico;
    }

    public EStatus getStatus() {
        return status;
    }

    public void setStatus(EStatus status) {
        this.status = status;
    }



}
