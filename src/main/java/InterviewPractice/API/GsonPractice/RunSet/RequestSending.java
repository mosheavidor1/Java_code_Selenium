package InterviewPractice.API.GsonPractice.RunSet;


import InterviewPractice.API.GsonPractice.Get.GetWithGson;
import InterviewPractice.API.GsonPractice.Post.PostRequest;

public class RequestSending {

    public static void main(String[] args) throws Exception {

        System.out.println("This is a POST request: ");
PostRequest post = new PostRequest();
post.getPostNewEmail();

System.out.println();

System.out.println("This is a GET request: ");

GetWithGson get = new GetWithGson();

get.getGetRequest();














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
