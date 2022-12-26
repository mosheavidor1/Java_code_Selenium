package InterviewPractice.API.GsonPractice;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Post  {

    String email;


    public void setEmail(String email) {
        this.email = email;
    }


    public static String postRequest() throws Exception{
        Post key = new Post();
        key.setEmail(PostWithGsonConst.EMAIL_VALUE);
        Gson gson = new Gson();
        String JsonRequest = gson.toJson(key);


        HttpRequest postRequest = HttpRequest.newBuilder().uri(new URI(PostWithGsonConst.URL))
                .POST(HttpRequest.BodyPublishers.ofString(JsonRequest)).build();


        HttpClient httpClient = HttpClient.newHttpClient();


        HttpResponse<String> postResponse = httpClient.send(postRequest, HttpResponse.BodyHandlers.ofString());

        System.out.println(postResponse.body());

        return postResponse.body();
    }
}




