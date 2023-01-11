package InterviewPractice.API.Json.Practice.NewJsonPractice.Infra;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public  class TestWithArray{




    public TestWithArray(){

        JsonArray array = new JsonArray();
        String path;
        Gson gson = new Gson();

            path = Statics.jsonPath;
        JsonElement elementRoot;
        try {
            elementRoot = gson.fromJson(new FileReader(path), JsonElement.class);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Map<String, String> map = new HashMap<>();
            array.parseJsonElement(elementRoot, map);
            String value = "Pets";
        System.out.println(map.get(value));

        }

    }

