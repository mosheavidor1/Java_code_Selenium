package InterviewPractice.API.Json.Practice;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import netscape.javascript.JSObject;
import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.json.Json;

import java.io.FileReader;
import java.util.*;

// From this url : https://www.youtube.com/watch?v=msUBRsYCX_I
//https://tools.learningcontainer.com/sample-json.json
//https://www.learningcontainer.com/sample-json-file/#JSON_Sample_File

public class ConvertJson {

    public static void main(String[] args) throws Exception {


        String jsonString = ("C:\\Practice\\sample-json.json");


        JsonObject jo = JsonParser.parseReader(new FileReader(jsonString)).getAsJsonObject();



    HashMap<String, Object> address = new Gson().fromJson(jo, HashMap.class);

        System.out.println(address);
        System.out.println();

        Set k= address.keySet();
        System.out.println();
        System.out.println("Key:   "+k);
        Collection v = address.values();
        System.out.println("Values "+v);
        Set e = address.entrySet();
        System.out.println("K-V :"+e);
        Iterator i=e.iterator();
        while (i.hasNext()){
            Map.Entry entry =(Map.Entry)i.next();
            System.out.println("Key "+entry.getKey()+"Value: "+entry.getValue());
        }






    }


}
