package report;

import domain.ItemOS;
import domain.Servico;

public class ImpressaoOS {
    public static String imprimirOS(Servico servico) {
        StringBuilder imprimir = new StringBuilder();

        Servico.setPontos(20);
        imprimir.append("========================================\n");
        imprimir.append("        *** ORDEM DE SERVIÇO ***        \n");
        imprimir.append("========================================\n");
        imprimir.append("ID do Serviço: ").append(Servico.getId());

        for (ItemOS itemOS : servico.getItens()) {
            imprimir.append("\n----------------------------------------\n");
            imprimir.append("=== Itens de Serviço === ");

            for (ItemOS os : servico.getItens()) {
                imprimir.append("\n").append("ID ").append(itemOS.getOrdemServico().getNumero()).append(" - ");
                imprimir.append(os.getServico().getDescricao());
            }
            imprimir.append("\n----------------------------------------\n");
            imprimir.append("Veículo: ").append(itemOS.getOrdemServico().getVeiculo().getID()).append("\n");
            imprimir.append("Agendado para: ").append(itemOS.getOrdemServico().getAgenda()).append("\n");
            imprimir.append("Status: ").append(itemOS.getOrdemServico().getStatus()).append("\n");

            if (itemOS.getObservacao() != null ) {
                imprimir.append("Observação: ").append(itemOS.getObservacao()).append("\n");
            }
            imprimir.append("\r\n");
            imprimir.append("Pontos do Cliente: ").append(Servico.getPontos()).append("\n");
            imprimir.append("Desconto: ").append(itemOS.getOrdemServico().getDesconto()).append("\n");
            imprimir.append("Valor: R$ ").append(String.format("%.2f", itemOS.getServico().getValor())).append("\n");
            imprimir.append("----------------------------------------\n");
        }
        imprimir.append("     Obrigado pela preferência!      \n");
        imprimir.append("========================================\n");

        return imprimir.toString();
    }

    }


