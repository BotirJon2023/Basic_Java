package org.example;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
public class ConvertHashMapToJSON {

    public static void main(String[] args) {


        Map<String, Object> mapValues = new HashMap<String, Object>();
        mapValues.put("firstName", "Botirjon");
        mapValues.put("lastName", "Ruzmetov");
        mapValues.put("age", 22);


        Gson gson = new Gson();


        String json = gson.toJson(mapValues);

        System.out.println(json);

    }
}
