package org.example;

/**
 * <b>Description Title</b>
 * Description Text.
 *
 * @author ${USER}
 * @since ${DAY} ${MONTH_NAME_SHORT} ${YEAR}
 */
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the API documentation URL: ");
        String apiUrl = scanner.nextLine();

        try {
            URL url = new URL(apiUrl);

           JsonObject apiDocsObj = JsonParser.parseString(jsonObjectString).getAsJsonObject();

            String version = apiDocsObj.getAsJsonObject("info").getAsJsonPrimitive("version").getAsString();

            System.out.println(version);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
