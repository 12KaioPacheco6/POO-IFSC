package report;

import domain.Cliente;
import domain.Veiculo;

public class Relatorio {
    public static String imprimirRelatorio(Cliente cliente) {
            StringBuilder dadosCliente = new StringBuilder();
            System.out.println(" Dados do Cliente - " + cliente.getClass().getSimpleName());
            System.out.println(cliente.getDados());
            for (Veiculo veiculo : cliente.getVeiculos()){
                System.out.println(veiculo.getDados());
            }
            return dadosCliente.toString();

    }
}
