package InterviewPractice.API.Covert.Audio;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

//for this practice see the video : https://www.youtube.com/watch?v=9oq7Y8n1t00 and use the website of https://www.assemblyai.com/docs/reference#transcript (already have a user over there)

public class RestApiPractice {


    public static void main(String[] args) throws Exception {
//post method
        Transcript transcript = new Transcript();
        transcript.setAudio_url("https://raw.githubusercontent.com/johnmarty3/JavaAPITutorial/main/Thirsty.mp4");
        Gson gson = new Gson();
        String jsonRequest = gson.toJson(transcript);
        System.out.println(jsonRequest);

        HttpRequest postRequest = HttpRequest.newBuilder()
                .uri(new URI("https://api.assemblyai.com/v2/transcript"))
                .header("Authorization", "6b3923cd69e149189e3460eb9fac3f5f").POST(HttpRequest.BodyPublishers.ofString(jsonRequest)).build();
        //another way to send this : POST(HttpRequest.BodyPublishers.ofString("{\"audio_url\": \"https://raw.githubusercontent.com/johnmarty3/JavaAPITutorial/main/Thirsty.mp4\")")

        HttpClient httpClient = HttpClient.newHttpClient();

        HttpResponse<String> postResponse = httpClient.send(postRequest, HttpResponse.BodyHandlers.ofString());

        System.out.println(postResponse.body());


        transcript = gson.fromJson(postResponse.body(), Transcript.class);
        System.out.println(transcript.getId());

        //Get method

        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(new URI("https://api.assemblyai.com/v2/transcript/" + transcript.getId()))
                .header("Authorization", "6b3923cd69e149189e3460eb9fac3f5f")
                .build();
        {

            while (true) {
                HttpResponse<String> getResponse = httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());
                transcript = gson.fromJson(getResponse.body(), Transcript.class);

                System.out.println(transcript.getStatus());


                if ("completed".equals(transcript.getStatus()) || "error".equals(transcript.getStatus())) ;
                break;

            }
            Thread.sleep(10000);

        }

        System.out.println("Transcription completed");
        System.out.println(transcript.getText());


    }
}











