package InterviewPractice.API.callme;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;

public class Send_HTTP_Post_Request {

    public static void main(String[] args) {

        try {
            Send_HTTP_Post_Request.call_me();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void call_me() throws Exception {
        URL url = new URL("https://httpbin.org/post");
        Map<Object, Object> params = new LinkedHashMap<>();

        params.put("name", " -  Moshe Avidor");
        params.put("email", "helloworld@gmail.com");
        params.put("CODE", 1111);
        params.put("message", "Hello Post Test success");
        StringBuilder postData = new StringBuilder();


        for (Map.Entry param : params.entrySet()) {
            if (postData.length() != 0) postData.append('&');
            postData.append(URLEncoder.encode(String.valueOf(param.getKey()), StandardCharsets.UTF_8));
            postData.append('=');
            postData.append(URLEncoder.encode(String.valueOf(param.getValue()), StandardCharsets.UTF_8));
        }
        byte[] postDataBytes = postData.toString().getBytes(StandardCharsets.UTF_8);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        conn.setDoOutput(true);
        conn.getOutputStream().write(postDataBytes);
        Reader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8));

        StringBuilder sb = new StringBuilder();
        for (int c; (c = in.read()) >= 0; )
            sb.append((char) c);
        String response = sb.toString();
        System.out.println(response);
        JSONObject myResponse = new JSONObject(response);
        System.out.println("result after Reading JSON Response");
        System.out.println("origin- " + myResponse.getString("origin"));
        System.out.println("url- " + myResponse.getString("url"));
        JSONObject form_data = myResponse.getJSONObject("form");
        System.out.println("CODE- " + form_data.getString("CODE"));
        System.out.println("email- " + form_data.getString("email"));
        System.out.println("message- " + form_data.getString("message"));
        System.out.println("name" + form_data.getString("name"));
    }
}





