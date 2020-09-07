
package api;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Api {

    public static void main(String[] args) throws IOException {
        /*String cityName="Shinjuku,Tokyo,Japan";
        String appid="";*/

        String url = "https://api.openweathermap.org/data/2.5/weather?q=%22+cityName+%22&appid=%22+appid";
        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
        connection.addRequestProperty("Accept-Charset", "UTF-8");
        connection.setRequestMethod("GET");
        connection.connect();
        if (connection.getResponseCode() < 300) {
//          //JSONレスポンスの中身を見たいときはこのコメントを解除..
//            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//            StringBuilder resp = new StringBuilder();
//            String tmp;
//            while ((tmp = reader.readLine()) != null) {
//                resp.append(tmp);
//            }
//            System.out.println(resp.toString());
          /*  ObjectMapper mapper=new ObjectMapper();
            JsonNode root=mapper.readTree(connection.getInputStream());
            JsonNode weatherMain=root.get("main");
            System.out.println(cityName+"'s current weather information is...");
            BigDecimal ABSOLUTE_TEMP=new BigDecimal("273.15");
            System.out.println("Weather Status: "+root.get("weather").get(0).get("main"));
            System.out.println("Current Temp  : "+(weatherMain.get("temp").decimalValue().subtract(ABSOLUTE_TEMP)));
            System.out.println("Sensible Temp : "+(weatherMain.get("feels_like").decimalValue().subtract(ABSOLUTE_TEMP)));
            System.out.println("Min Temp      : "+(weatherMain.get("temp_min").decimalValue().subtract(ABSOLUTE_TEMP)));
            System.out.println("Max Temp      : "+(weatherMain.get("temp_max").decimalValue().subtract(ABSOLUTE_TEMP)));
            System.out.println("Pressure      : "+(weatherMain.get("pressure").intValue()));
        } else {
            //クライエント側の問題
            System.out.println(connection.getResponseCode());
            System.out.println(connection.getResponseMessage());*/
        }
    }
}
