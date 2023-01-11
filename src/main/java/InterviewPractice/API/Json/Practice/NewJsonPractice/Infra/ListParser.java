package InterviewPractice.API.Json.Practice.NewJsonPractice.Infra;

import com.google.gson.JsonElement;

import java.util.List;

public interface ListParser {

    void parseJsonElement(JsonElement element, List<String> list);
}
