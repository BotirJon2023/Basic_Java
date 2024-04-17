package org.example;

import java.util.Set;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
public class GsonGetAllKeysFromJSONObject {

    public static void main(String[] args) {

        String jsonData = "{\"Id\": \"EMP001\",\"Name\": \"Bob\",\"Age\": 22,\"IsManager\": false,\"ReservedParking\": null}";


        JsonObject jsonObject = JsonParser.parseString(jsonData).getAsJsonObject();


        Set<String> setKeys = jsonObject.keySet();


        for(String key : setKeys) {
            System.out.println(key);
        }
    }

}
