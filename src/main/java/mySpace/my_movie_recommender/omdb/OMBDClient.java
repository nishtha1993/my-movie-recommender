package ombd;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class OMDBClient {

    private static final String API_KEY = "ec16e248";
    private static final String BASE_URL = "http://www.omdbapi.com/";

    public String getMovies(String searchQuery) {
        String requestUrl = BASE_URL + "?s=" + searchQuery + "&apikey=" + API_KEY;
        return requestData(requestUrl);
    }

    public String requestData(String requestUrl) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(requestUrl))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                return response.body();
            } else {
                System.err.println("Error: Received HTTP status code " + response.statusCode());
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        OMDBClient client = new OMDBClient();
        String response = client.getMovies("inception");
        System.out.println(response);
    }
}
