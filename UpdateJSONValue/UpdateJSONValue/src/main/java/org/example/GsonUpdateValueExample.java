package org.example;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class GsonUpdateValueExample {

    public static void main(String[] args) {

        String jsonData = "{\"name\": \"Bob\",\"age\": 23,\"department\":\"IT\"}";


        JsonObject jsonObject = new Gson().fromJson(jsonData, JsonObject.class);


        System.out.println("Original JSON: " + jsonObject);


        JsonArray deptArray = new JsonArray();
        deptArray.add("Support");
        deptArray.add("ERP");

        jsonObject.add("department", deptArray);

        System.out.println("Modified JSON: " + jsonObject);
    }
}
