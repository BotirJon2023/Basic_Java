package org.example;

import java.util.Map.Entry;
import java.util.Set;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class GsonGetAllKeysExample {

    public static void main(String[] args) {

        String jsonData = "{\"Id\": \"EMP001\",\"Name\": \"Bob\",\"Age\": 22,\"IsManager\": false,\"ReservedParking\": null}";


        JsonObject jsonObject = JsonParser.parseString(jsonData).getAsJsonObject();


        Set<Entry<String, JsonElement>> entries = jsonObject.entrySet();


        for(Entry<String, JsonElement> entry : entries) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }

}
