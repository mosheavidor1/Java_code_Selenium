package InterviewPractice.API.GsonPractice.infra;

import InterviewPractice.API.Covert.Audio.Transcript;
import com.google.gson.Gson;

public class GsonHandler {


    public static String turnToJson() throws Exception {
        Requests key = new Requests();
        key.setEmail(GsonConst.EMAIL_VALUE);
        Gson gson = new Gson();
        String JsonRequest = gson.toJson(key);

        return JsonRequest;
    }

}



