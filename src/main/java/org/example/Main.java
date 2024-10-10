package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        UserInterface ui = new UserInterface();
        CurrencyConverter converter = new CurrencyConverter();

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

                    ui.mostrarResultado(valor, codigos[0], resultado, codigos[1]);
                } else {
                    System.out.println("Opção inválida. Tente novamente.");
                }
            }

        } while (!conversao.equals("9"));

        ui.exibirMensagemSaida();
    }
}
