package org.example;

import com.google.gson.Gson;
import java.util.HashMap;

public class GsonJSONToHashMapExample {
    public static void main(String[] args) {

        String jsonData = "{\"rollNumber\": 1, \"name\": \"Bob\", \"marks\": 90}";

        Gson gson = new Gson();

        HashMap<String, Object> mapStudent = gson.fromJson(jsonData, HashMap.class);

        System.out.println(mapStudent);
    }
}
