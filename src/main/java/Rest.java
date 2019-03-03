import org.json.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Rest {

    String jsonString;

    HereMapsCredential map = new HereMapsCredential();

    public String customAdress(String city, String street, String buldingNumber) throws Exception {

        String url = "https://geocoder.api.here.com/6.2/geocode.json?app_id="+map.hereAppId+"&app_code="+
                map.hereAppCode+"&searchtext="+buldingNumber+"+"+
                street+"+"+city;

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // optional default is GET
        con.setRequestMethod("GET");

        //add request header
        con.setRequestProperty("User-Agent", "Mozilla/5.0");

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        System.out.println(response.toString());

        String hereMapsJsonResponse = new JSONObject(response).toString();

this.setJsonString(response.toString());
        return hereMapsJsonResponse;
    }

    public String getJsonString() {
        return jsonString;
    }

    public void setJsonString(String jsonString) {
        this.jsonString = jsonString;
    }

    public String getLatitude () {


        String str = this.getJsonString();


        JSONObject data = new JSONObject(str);

        System.out.println(data);

        JSONObject response = data.getJSONArray("Response").getJSONObject(0);

        JSONObject view = response.getJSONArray("View").getJSONObject(0);

        JSONObject result = view.getJSONArray("Result").getJSONObject(0);

        JSONObject location = result.getJSONArray("Location").getJSONObject(0);

        JSONObject displayPosition = location.getJSONArray("DisplayPosition").getJSONObject(0);


        System.out.println(displayPosition.getString("Latitude"));
        String latitude = displayPosition.getString("Latitude");
        System.out.println("Latitude " + latitude);
        return latitude;


            }

        }



