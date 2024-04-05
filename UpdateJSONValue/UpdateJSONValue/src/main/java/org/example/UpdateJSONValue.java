package org.example;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class UpdateJSONValue {

    public static void main(String[] args) {

        String jsonData = "{\"name\": \"Bob\",\"age\": 23,\"department\":\"IT\"}";


        JsonObject jsonObject = new Gson().fromJson(jsonData, JsonObject.class);


        System.out.println("Original JSON: " + jsonObject);


        jsonObject.addProperty("department", "HR");

        System.out.println("Modified JSON: " + jsonObject);
    }
}
