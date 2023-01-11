

package InterviewPractice.API.Json.Practice.NewJsonPractice.Infra;

import com.google.gson.JsonElement;

import java.util.Map;
import java.util.Set;

public class JsonObject implements MapParser {


    @Override
    public void parseJsonElement(JsonElement element, Map<String, String> map) {

        if (element.isJsonObject()) {
            Set<Map.Entry<String, JsonElement>> entries = element.getAsJsonObject().entrySet();
            try {


                for (Map.Entry<String, JsonElement> entry : entries) {
                    com.google.gson.JsonObject object = entry.getValue().getAsJsonObject();

                    map.put(entry.getKey(), object.toString());

                    parseJsonElement(object, map);
                }

            } catch (IllegalStateException e) {

            }
        }
    }
}



