import api.CurrencyAPI;
import java.io.IOException;
import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in); // Initialize Scanner to read user input
        CurrencyAPI currencyAPI = new CurrencyAPI(); // Initialize CurrencyAPI instance

        while (true) {
            String menu = """
               
               ************************************
               C O N V E R S O R  D E  M O E D A S
               ************************************
               
                1. Dólar para Peso Argentino
                2. Peso Argentino para Dólar
                3. Dólar para Real Brasileiro
                4. Real Brasileiro para Dólar
                5. Peso Argentino para Real Brasileiro
                6. Real Brasileiro para Peso Argentino
                7. Euro para Real Brasileiro
                8. Real Brasileiro para Euro
                9. Euro para Dólar
                10. Sair
                
               Escolha uma opção: """;
            System.out.print(menu);

            int choice = scanner.nextInt(); // Read user's choice

            String fromCurrency = "";
            String toCurrency = "";

            // Determine fromCurrency and toCurrency based on user's choice
            switch (choice) {
                case 1:
                    fromCurrency = "USD";
                    toCurrency = "ARS";
                    break;
                case 2:
                    fromCurrency = "ARS";
                    toCurrency = "USD";
                    break;
                case 3:
                    fromCurrency = "USD";
                    toCurrency = "BRL";
                    break;
                case 4:
                    fromCurrency = "BRL";
                    toCurrency = "USD";
                    break;
                case 5:
                    fromCurrency = "ARS";
                    toCurrency = "BRL";
                    break;
                case 6:
                    fromCurrency = "BRL";
                    toCurrency = "ARS";
                    break;
                case 7:
                    fromCurrency = "EUR";
                    toCurrency = "BRL";
                    break;
                case 8:
                    fromCurrency = "BRL";
                    toCurrency = "EUR";
                    break;
                case 9:
                    fromCurrency = "EUR";
                    toCurrency = "USD";
                    break;
                case 10:
                    // Exits the program and the while loop
                    System.out.println("\nSaindo... até a próxima!");
                    System.out.println(".");
                    System.out.println(".");
                    System.out.println(".");
                    scanner.close(); // Closes the Scanner before exiting
                    System.exit(0);
                    break;
                default:
                    // Handles invalid option
                    System.out.println("Opção inválida. Tente novamente.");
                    continue;
            }

            System.out.print("Digite o valor a ser convertido: ");
            double amount = scanner.nextDouble(); // Reads amount to convert

            try {
                // Gets the exchange rate from CurrencyAPI using the getExchangeRate() method
                double exchangeRate = currencyAPI.getExchangeRate(fromCurrency, toCurrency);

                // Calculates the converted amount
                double convertedAmount = amount * exchangeRate;

                System.out.println(".");
                System.out.println(".");
                System.out.println(".");
                System.out.printf("\nTAXA DE CÂMBIO: 1 %s = %.2f %s%n", fromCurrency, exchangeRate, toCurrency);
                System.out.printf("VALOR CONVERTIDO: %.2f %s = %.2f %s%n\n", amount, fromCurrency, convertedAmount, toCurrency);
                System.out.println(".");
                System.out.println(".");
                System.out.println(".");
            } catch (IOException | InterruptedException e) {
                System.out.println("Erro ao converter: " + e.getMessage());
            }
        }
    }
}
