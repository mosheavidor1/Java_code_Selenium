package InterviewPractice.API.GsonPractice.Get;


import InterviewPractice.API.GsonPractice.infra.GsonConst;
import InterviewPractice.API.GsonPractice.infra.Requests;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GetWithGson {

    String getRequest;



    private static String getRequest() throws Exception {


        Gson gson = new Gson();

        Requests key = new Requests();

        key.setUrl(GsonConst.URL_VALUE);
        key.setOrigin(GsonConst.ORIGIN_VALUE);


        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(new URI(GsonConst.GET))
                .build();

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse<String> getResponse = httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());


        key = gson.fromJson(getResponse.body(), Requests.class);


        System.out.println("The IP address is : " + " " + key.getOrigin());
        System.out.println("The URL address is : " + " " + key.getUrl());


        return getResponse.body();


    }

    public String getGetRequest() throws Exception {
        this.getRequest=getRequest();
        return getRequest;
    }
;
}












