import org.json.simple.JSONObject;

import java.util.Scanner;

public class WeatherAPIApplication {
    public static void main(String[] args) {
        try {
            String city = null;
            Scanner scanner = new Scanner(System.in);
            while(true) {
                System.out.println("------------------------------------------------------------------------");
                System.out.print("Enter the city : ");
                city = scanner.nextLine();

                if (city == null) {
                    break;
                }
                // getting the Latitude and Longitude of the city.
                JSONObject cityGeoLocation = WeatherAPIUtils.fetchLocationData(city);
                assert cityGeoLocation != null;
                double latitude = (double) cityGeoLocation.get("latitude");
                double longitude = (double) cityGeoLocation.get("longitude");
                // getting the weather data using the geoLocations of the city and printing them.
                WeatherAPIUtils.fetchWeatherData(latitude, longitude);
            }
        } catch (Exception e) {
            System.out.println("Unable to fetch the weather for the entered city :(");
        }
    }
}
