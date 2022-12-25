package InterviewPractice.API.Json.Practice;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileReader;
import java.util.*;

// From this url : https://www.youtube.com/watch?v=msUBRsYCX_I
//https://tools.learningcontainer.com/sample-json.json
//https://www.learningcontainer.com/sample-json-file/#JSON_Sample_File

public class ConvertJson {

    public static void main(String[] args) throws Exception {


        String jsonString = ("C:\\practice\\sample-json-file.json");


        JsonObject jo = JsonParser.parseReader(new FileReader(jsonString)).getAsJsonObject();


      HashMap<String, Object> allJson = new Gson().fromJson(jo, HashMap.class);

        System.out.println(allJson);
        System.out.println();

        Set k = allJson.keySet();
        System.out.println();
        System.out.println("Key:   " + k);
        Collection v = allJson.values();
        System.out.println("Values " + v);
        Set e = allJson.entrySet();
        System.out.println("K-V :" + e);
        Iterator i = e.iterator();
        while (i.hasNext()) {
            Map.Entry entry = (Map.Entry) i.next();
            System.out.println( entry.getKey() +" : "+ entry.getValue());
        }


    }


}
