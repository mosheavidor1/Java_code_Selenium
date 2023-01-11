package InterviewPractice.API.Json.Practice.NewJsonPractice.Infra;

import com.google.gson.JsonElement;

import java.util.Map;
import java.util.Set;

public class JsonArray implements MapParser {




    @Override
    public  void parseJsonElement(JsonElement element, Map<String, String> map) {


        if (element.isJsonObject()) {
            Set<Map.Entry<String, JsonElement>> entries = element.getAsJsonObject().entrySet();
            for (Map.Entry<String, JsonElement> entry : entries) {
                if (entry.getValue().isJsonArray()) {
                    com.google.gson.JsonArray array = entry.getValue().getAsJsonArray();
                    for (JsonElement arrayElement : array) {
                        // for the last value-  map.put(entry.getKey(), arrayElement.getAsString());
                        map.put(entry.getKey(), array.toString());
                        //for the last value- parseJsonElement(arrayElement, map);
                        parseJsonElement(array, map);
                    }
                } else {
                    try {
                        map.put(entry.getKey(), entry.getValue().getAsString());
                        parseJsonElement(entry.getValue(), map);
                    } catch (UnsupportedOperationException e) {

                    }
                }
            }
        }

    }
}











//"C:\\practice\\sample-json-file.json";