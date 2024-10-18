import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class WeatherAPIUtils {

    public static JSONObject fetchLocationData(String city) {
        try {
            // Modifying the API URL and passing the city name as a parameter
            String url = "https://geocoding-api.open-meteo.com/v1/search?name=" + city + "&count=1&language=en&format=json";

            HttpURLConnection connection = getURLConnection(url);

            if(connection.getResponseCode() != 200){
                return null;
            }

            String connectionContent = readResponse(connection);

            JSONParser parser = new JSONParser();

            JSONObject geoLocation = (JSONObject) parser.parse(connectionContent);
            JSONArray jsonArray = (JSONArray) geoLocation.get("results");
            return (JSONObject) jsonArray.get(0);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String readResponse(HttpURLConnection connection) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            Scanner scanner = new Scanner(connection.getInputStream());
            while (scanner.hasNext()){
                stringBuilder.append(scanner.nextLine());
            }
            scanner.close();
            return stringBuilder.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    private static HttpURLConnection getURLConnection(String url) {
        try {
            URI uri = new URI(url);
            HttpURLConnection connection = (HttpURLConnection) uri.toURL().openConnection();
            connection.setRequestMethod("GET");
            return connection;
        } catch (IOException | URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    public static void fetchWeatherData(double latitude, double longitude) {
        try{
             String url = "https://api.open-meteo.com/v1/forecast?latitude=" + latitude + "&longitude=" + longitude + "&current=temperature_2m,relative_humidity_2m,is_day,rain";
             HttpURLConnection connection = getURLConnection(url);
             if(connection.getResponseCode() != 200){
                 System.out.println("Not able to fetch the weather forecast now!");
                 return;
             }

             String weather = readResponse(connection);

             JSONParser parser = new JSONParser();
             JSONObject jsonObject = (JSONObject) parser.parse(weather);
             JSONObject currentWeather = (JSONObject) jsonObject.get("current");

             String time = (String) currentWeather.get("time");
             System.out.println("Time: "+time);

             Double temperature = (Double) currentWeather.get("temperature_2m");
             System.out.println("Temperature: "+temperature);

            Long humidity = (Long) currentWeather.get("relative_humidity_2m");
            System.out.println("Humidity: "+humidity);

            Long isDay = (Long) currentWeather.get("is_day");
            System.out.println("Is Day ? " + (isDay == 1 ? "Yes":"No"));

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
