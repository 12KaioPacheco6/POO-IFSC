package report;

import domain.ItemOS;
import domain.Servico;

public class ImpressaoOS {
    public static String imprimirOS(Servico servico) {
        StringBuilder imprimir = new StringBuilder();

        imprimir.append("========================================\n");
        imprimir.append("        *** ORDEM DE SERVIÇO ***        \n");
        imprimir.append("========================================\n");
        imprimir.append("ID do Serviço: ").append(servico.getId()).append("\n");
        imprimir.append("----------------------------------------\n");
        imprimir.append("Veículo          Cliente           Valor\n");
        imprimir.append("----------------------------------------\n");

        for (ItemOS itemOS : servico.getItens()) {
            imprimir.append("Ordem: ").append(itemOS.getOrdemServico().getNumero()).append("\n");
            imprimir.append("Serviço: ").append(itemOS.getServico().getDescricao()).append("\n");
            imprimir.append("Veículo: ").append(itemOS.getOrdemServico().getVeiculo().getID()).append("\n");
//            imprimir.append("Cliente: ").append(itemOS.getOrdemServico().getVeiculo().getCliente().getNome()).append("\n");
            imprimir.append("Agendado para: ").append(itemOS.getOrdemServico().getAgenda()).append("\n");
            imprimir.append("Status: ").append(itemOS.getOrdemServico().getStatus()).append("\n");

            if (itemOS.getObservacao() != null && !itemOS.getObservacao().isEmpty()) {
                imprimir.append("Observação: ").append(itemOS.getObservacao()).append("\n");
            }

            imprimir.append("Valor: R$ ").append(String.format("%.2f", itemOS.getServico().getValor())).append("\n");
            imprimir.append("----------------------------------------\n");
        }

        imprimir.append("     Obrigado pela preferência!      \n");
        imprimir.append("========================================\n");

        return imprimir.toString();
    }

    }


