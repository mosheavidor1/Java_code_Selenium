package InterviewPractice.API.Json.Practice.NewJsonPractice.Infra;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

public class TestWithList {


    public TestWithList() throws FileNotFoundException {

    JsonWithList jsonWithList = new JsonWithList();

    String path = Statics.jsonPath;

    Gson gson = new Gson();

    JsonElement elementRoot = gson.fromJson(new FileReader(path), JsonElement.class);


    List<String> list = new LinkedList<>();
        jsonWithList.parseJsonElement(elementRoot,list);

    JsonElement petsElement = elementRoot.getAsJsonObject().get("Pets");
   JsonArray petsArray = petsElement.getAsJsonArray();


        for(
    JsonElement petElement :petsArray)

    {
        list.add(petElement.getAsString());


        System.out.println(petElement);
    }

}
}