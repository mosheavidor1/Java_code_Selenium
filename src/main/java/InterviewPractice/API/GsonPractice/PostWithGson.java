package InterviewPractice.API.GsonPractice;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static InterviewPractice.API.GsonPractice.Post.postRequest;


public class PostWithGson {

    public static void main(String[] args) throws Exception {
        postRequest();





    }


}









//Read_ME:

////From this url https://www.chillyfacts.com/java-send-http-getpost-request-and-read-json-response/   need to create also POST method .




//Note if we need to add UserName and Password for Authentication:
// we add .header to HttpRequest after uri like in this example :
//        HttpRequest postRequest = HttpRequest.newBuilder()
//                .uri(new URI("https://api.assemblyai.com/v2/transcript"))
//          ***like this -   .header("Authorization", "6b3923cd69e149189e3460eb9fac3f5f").POST(HttpRequest.BodyPublishers.ofString(jsonRequest)).build();
//
