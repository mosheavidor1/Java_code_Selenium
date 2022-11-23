package InterviewPractice.API.Call.Me;

import com.google.gson.Gson;

import java.util.LinkedHashMap;
import java.util.Map;

public class APIPractice {


    public static void main(String[] args) {

//        JsonParams params = new JsonParams();
//
//        params.setName("moshe");
//        params.setId("065950933");
//
//
//        Gson gson =new Gson();
//        String JsonRequest = gson.toJson(params);
//        System.out.println(JsonRequest);


        Map params = new LinkedHashMap();
        params.put("name","mohse");
        params.put("id","065950933");
        System.out.println(params);

    }




}
