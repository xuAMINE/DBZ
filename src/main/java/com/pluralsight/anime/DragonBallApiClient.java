package com.pluralsight.anime;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DragonBallApiClient {

    public static void main(String[] args) {
        try {
            // Step 1: Create HTTP Client and Request
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://dragonball-api.com/api/characters?page=1&limit=50"))
                    .GET()
                    .build();

            // Step 2: Send the request and get response
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Step 3: Parse JSON response
            ObjectMapper mapper = new ObjectMapper();
            CharacterResponse characterResponse = mapper.readValue(response.body(), CharacterResponse.class);

            // Step 4: Display characters
            System.out.println("Dragon Ball Characters:");
            for (CharacterData character : characterResponse.items) {
                System.out.println("- " + character.name + " | Ki: " + character.ki);
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    // DTO for API response
    @JsonIgnoreProperties(ignoreUnknown = true)
    static class CharacterResponse {
        public CharacterData[] items;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    static class CharacterData {
        public String name;
        public String ki;
    }
}
