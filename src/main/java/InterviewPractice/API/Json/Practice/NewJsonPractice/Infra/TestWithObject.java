package InterviewPractice.API.Json.Practice.NewJsonPractice.Infra;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestWithObject {


    public TestWithObject() throws FileNotFoundException {
        JsonObject object = new JsonObject();

       Gson gson =new Gson();
        String path = Statics.jsonPath;
        JsonElement elementRoot = gson.fromJson(new FileReader(path), JsonElement.class);
        com.google.gson.JsonObject jsonObject = elementRoot.getAsJsonObject();
        String value = jsonObject.get("Name").getAsString();
        System.out.println(value);
    }
}






