package InterviewPractice.API.callme;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

//From this url https://www.chillyfacts.com/java-send-http-getpost-request-and-read-json-response/   need to create also POST method .

public class Send_HTTP_Request {


    public static void main(String[] args) throws Exception {

        try {
            Send_HTTP_Request.callMe();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void callMe() throws Exception {
        String url = "http://httpbin.org/ip";

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        con.setRequestMethod("GET");

        con.setRequestProperty("User-Agent", "Mozilla/5.0");

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();


        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);


        }
        in.close();
        System.out.println(response);
        JSONObject myResponse = new JSONObject(response.toString());
        System.out.println("result after Reading JSON Response");
        System.out.println("origin- " + myResponse.getString("origin"));
    }
}

