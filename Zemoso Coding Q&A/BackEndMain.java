import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class BackEndMain {

    public static void main(String[] args) {
        System.setProperty("http.agent", "Chrome");

        try {
            URL url = new URL("https://coderbyte.com/api/challenges/json/age-counting");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }

            // Close connections
            in.close();
            connection.disconnect();

            // Parse JSON response
            JSONObject jsonResponse = new JSONObject(content.toString());
            String data = jsonResponse.getString("data");

            // Count ages >= 50
            int count = 0;
            String[] items = data.split(", ");
            for (String item : items) {
                if (item.startsWith("age=")) {
                    int age = Integer.parseInt(item.split("=")[1]);
                    if (age >= 50) {
                        count++;
                    }
                }
            }

            // Print the count
            System.out.println(count);

            // Challenge Token
            String challengeToken = "0ouj7p135";
            String finalOutput = count + " " + challengeToken;

            // Replace every fourth character with an underscore
            StringBuilder modifiedOutput = new StringBuilder(finalOutput);
            for (int i = 3; i < modifiedOutput.length(); i += 4) {
                modifiedOutput.setCharAt(i, '_');
            }

            // Print the modified output
            System.out.println(modifiedOutput.toString());

        } catch (MalformedURLException e) {
            System.out.println("Malformed URL: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
