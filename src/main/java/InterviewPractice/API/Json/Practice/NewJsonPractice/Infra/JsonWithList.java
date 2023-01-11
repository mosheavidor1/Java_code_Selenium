package InterviewPractice.API.Json.Practice.NewJsonPractice.Infra;

import com.google.gson.JsonElement;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class JsonWithList implements ListParser {



    public JsonWithList(){


    }

    @Override
    public void parseJsonElement(JsonElement element, List<String> list) {

        if (element.isJsonObject()) {
            Set<Map.Entry<String, JsonElement>> entries = element.getAsJsonObject().entrySet();
            for (Map.Entry<String, JsonElement> entry : entries) {
                if (entry.getValue().isJsonArray()) {
                    com.google.gson.JsonArray array = entry.getValue().getAsJsonArray();
                    for (JsonElement arrayElement : array) {
                        list.add(arrayElement.getAsString());
                        parseJsonElement(arrayElement, list);
                    }
                } else {
                    try {


                        list.add(entry.getValue().getAsString());
                        parseJsonElement(entry.getValue(), list);
                    } catch (UnsupportedOperationException e) {

                    }
                }

            }
        }
    }
}









//"C:\\practice\\sample-json-file.json";

