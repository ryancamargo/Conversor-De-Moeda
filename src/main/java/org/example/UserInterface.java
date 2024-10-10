package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private final Scanner scanner = new Scanner(System.in);
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    public void exibirMenu() {
        System.out.println("Seja Bem-Vindo ao Conversor de Moedas =)");
        System.out.println("1) Dólar =>> Peso Argentino");
        System.out.println("2) Peso Argentino =>> Dólar");
        System.out.println("3) Dólar =>> Real Brasileiro");
        System.out.println("4) Real Brasileiro =>> Dólar");
        System.out.println("5) Dólar =>> Peso Colombiano");
        System.out.println("6) Peso Colombiano =>> Dólar");
        System.out.println("7) Euro =>> Yuan Chinês");
        System.out.println("8) Yuan Chinês =>> Euro");
        System.out.println("9) Sair");
        System.out.print("Escolha uma opção válida: ");
    }

    public String obterOpcao() {
        return scanner.nextLine();
    }

    public String[] selecionarCodigos(String conversao) {
        return switch (conversao) {
            case "1" -> new String[]{"USD", "ARS"};
            case "2" -> new String[]{"ARS", "USD"};
            case "3" -> new String[]{"USD", "BRL"};
            case "4" -> new String[]{"BRL", "USD"};
            case "5" -> new String[]{"USD", "COP"};
            case "6" -> new String[]{"COP", "USD"};
            case "7" -> new String[]{"EUR", "CNY"};
            case "8" -> new String[]{"CNY", "EUR"};
            default -> null;
        };
    }

    public String obterValor() {
        System.out.print("Digite o valor que deseja converter: ");
        return scanner.nextLine();
    }

    public void mostrarResultado(String valor, String moedaOrigem, double resultado, String moedaDestino) {
        System.out.println("Valor " + valor + " [" + moedaOrigem + "] corresponde ao valor final de =>>> "
                + resultado + " [" + moedaDestino + "]");
        imprimirSeparador();
    }

    public String criarRegistro(String conversao, String valor, String moedaOrigem, String moedaDestino, double resultado) {
        LocalDateTime agora = LocalDateTime.now();
        String timestamp = formatter.format(agora);
        return String.format("[%s] %s => %s %s => %s %s", timestamp, valor, moedaOrigem, resultado, moedaDestino, obterNomeConversao(conversao));
    }

    private String obterNomeConversao(String conversao) {
        return switch (conversao) {
            case "1" -> "Dólar para Peso Argentino";
            case "2" -> "Peso Argentino para Dólar";
            case "3" -> "Dólar para Real Brasileiro";
            case "4" -> "Real Brasileiro para Dólar";
            case "5" -> "Dólar para Peso Colombiano";
            case "6" -> "Peso Colombiano para Dólar";
            case "7" -> "Euro para Yuan Chinês";
            case "8" -> "Yuan Chinês para Euro";
            default -> "Conversão desconhecida";
        };
    }

    public void mostrarHistorico(List<String> historico) {
        System.out.println("\nHistórico de Conversões:");
        for (String log : historico) {
            System.out.println(log);
        }
        imprimirSeparador();
    }

    public void exibirMensagemSaida() {
        System.out.println("\nObrigado por usar o Conversor de Moedas :)");
        imprimirSeparador();
    }

    public void imprimirSeparador() {
        System.out.println("*".repeat(60));
    }
}
