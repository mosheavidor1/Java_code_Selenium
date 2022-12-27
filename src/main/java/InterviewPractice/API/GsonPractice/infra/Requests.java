package InterviewPractice.API.GsonPractice.infra;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Requests {

    String email;


    public void setEmail(String email) {


        this.email = email;
    }

public String getEmail(){
        return email;
}


    }





