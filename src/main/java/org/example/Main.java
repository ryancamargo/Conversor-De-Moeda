package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        UserInterface ui = new UserInterface();
        CurrencyConverter converter = new CurrencyConverter();
        List<String> historico = new ArrayList<>(); // Lista para armazenar o histórico

        String conversao;

        do {
            ui.imprimirSeparador();
            ui.exibirMenu();
            conversao = ui.obterOpcao();

            if (!conversao.equals("9")) {
                String[] codigos = ui.selecionarCodigos(conversao);

                if (codigos != null) {
                    String valor = ui.obterValor();
                    double resultado = converter.converter(codigos[0], codigos[1], valor);

                    String registro = ui.criarRegistro(conversao, valor, codigos[0], codigos[1], resultado);
                    historico.add(registro); // Adiciona o registro ao histórico

                    ui.mostrarResultado(valor, codigos[0], resultado, codigos[1]);
                } else {
                    System.out.println("Opção inválida. Tente novamente.");
                }
            }

        } while (!conversao.equals("9"));

        ui.mostrarHistorico(historico); // Mostra o histórico de conversões
        ui.exibirMensagemSaida();
    }
}
