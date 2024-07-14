
import br.com.alura.ConversorDeMoeda.model.Cambio;
import br.com.alura.ConversorDeMoeda.model.CambioDTO;
import br.com.alura.ConversorDeMoeda.service.ExchangeRate;
import br.com.alura.ConversorDeMoeda.service.Servico;

import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Servico servico = new Servico();
        ExchangeRate exchangeRate = new ExchangeRate();


        System.out.println("Informe a moeda de origem (ex: USD):");
        String fromCurrency = scanner.nextLine().toUpperCase();

        System.out.println("Informe a moeda de destino (ex: BRL):");
        String toCurrency = scanner.nextLine().toUpperCase();

        System.out.println("Informe o valor a ser convertido:");
        String amount = scanner.nextLine();

        String json = servico.obterDados(fromCurrency, toCurrency, amount);

        CambioDTO moeda = exchangeRate.desserializar(json);

        Cambio cambio = new Cambio(moeda);
        System.out.println("O valor de " + fromCurrency + amount + " São " + toCurrency + cambio.getRate());
        System.out.printf("O valor %s %s são %s %.2f", fromCurrency, amount, toCurrency, cambio.getRate());
    }
}


