package InterviewPractice.API.GsonPractice.Post;

import InterviewPractice.API.Covert.Audio.Transcript;
import InterviewPractice.API.GsonPractice.infra.GsonConst;
import InterviewPractice.API.GsonPractice.infra.GsonHandler;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public  class PostRequest {



String postNewEmail;




    private static  String postNewEmail() throws Exception {



        HttpRequest postRequest = HttpRequest.newBuilder().uri(new URI(GsonConst.URL))
                .POST(HttpRequest.BodyPublishers.ofString(GsonHandler.turnToJson())).build();


        HttpClient httpClient = HttpClient.newHttpClient();


        HttpResponse<String> postResponse = httpClient.send(postRequest, HttpResponse.BodyHandlers.ofString());


        System.out.println(postResponse.body());


        return postResponse.body();
    }


    public String getPostNewEmail() throws Exception {

        this.postNewEmail=postNewEmail();


        return postNewEmail;
    }


}
