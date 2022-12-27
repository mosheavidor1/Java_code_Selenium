package InterviewPractice.API.GsonPractice.Get;

import InterviewPractice.API.Covert.Audio.Transcript;
import InterviewPractice.API.GsonPractice.infra.GsonConst;
import InterviewPractice.API.GsonPractice.infra.Requests;
import com.google.gson.Gson;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GetWithGson  {

    String getNewEmail;




    private static  String getNewEmail() throws Exception {

        Requests requests = new Requests();
        Gson gson = new Gson();


        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(new URI(GsonConst.URL + requests.getEmail()))
                .build();

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse<String> getResponse = httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());
        try {
            requests = gson.fromJson(getResponse.body(), Requests.class);

        } catch (Exception e) {
            System.out.println(requests.getEmail());





        }
        return requests.getEmail();
    }

    public String getGetNewEmail() throws Exception {

        this.getNewEmail=getNewEmail();

        return getNewEmail;
    }
}











