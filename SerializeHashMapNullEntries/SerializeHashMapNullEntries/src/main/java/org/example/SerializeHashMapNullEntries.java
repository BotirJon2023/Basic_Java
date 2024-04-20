package org.example;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.Gson;

public class SerializeHashMapNullEntries {

    public static void main(String[] args) {

        Map<String, String> mapEmpValues = new HashMap<String, String>();

        mapEmpValues.put("id", "EMP001");
        mapEmpValues.put("name", "Bob");
        mapEmpValues.put("age", "22");
        mapEmpValues.put("parkingLot", null);

        String jsonData = new Gson().toJson(mapEmpValues);

        System.out.println(jsonData);

    }

}
