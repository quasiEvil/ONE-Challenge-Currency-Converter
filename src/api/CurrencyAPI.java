package api;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Properties;

public class CurrencyAPI {

    private String apiKey;
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/";

    public CurrencyAPI() throws IOException {
        // Constructor: Initializes CurrencyAPI instance and loads API key from config.properties
        loadApiKey();
    }

    private void loadApiKey() throws IOException {
            // Loads API key from config.properties file.
            Properties properties = new Properties();
            properties.load(new FileInputStream("config.properties"));
            apiKey = properties.getProperty("exchange.rate.api.key");
    }

    public double getExchangeRate(String fromCurrency, String toCurrency) throws IOException, InterruptedException {
        /// Constructs the URI for the API request using API key, fromCurrency, and toCurrency
        URI targetURI = URI.create(API_URL + apiKey + "/pair/" + fromCurrency + "/" + toCurrency);

        // Builds GET request
        HttpRequest request = HttpRequest.newBuilder()
                .uri(targetURI)
                .GET()
                .build();

        // Creates an HttpClient to send the request
        HttpClient client = HttpClient.newHttpClient();

        // Sends the HTTP request and gets the response
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Parse the JSON response to get the conversion rate and return it
        JsonObject jsonObject = JsonParser.parseString(response.body()).getAsJsonObject();
        return jsonObject.get("conversion_rate").getAsDouble();
    }
}
