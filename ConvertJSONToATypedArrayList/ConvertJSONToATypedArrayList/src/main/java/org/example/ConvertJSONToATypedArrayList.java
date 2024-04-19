package org.example;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ConvertJSONToATypedArrayList {

    public static void main(String[] args) {

        String jsonData = "["
                + "{\"id\": \"EMP001\",\"name\": \"Alex\",\"age\": 22,\"isManager\": false,\"reservedParking\": null,\"languages\": [\"English\", \"Spanish\"]}, "
                + "{\"id\": \"EMP002\",\"name\": \"John\",\"age\": 41,\"isManager\": true,\"reservedParking\": \"PARK001\",\"languages\": [\"English\", \"German\", \"Italian\"]}"
                + "]";

        TypeToken<ArrayList<Employee>> typeListEmployee = new TypeToken<ArrayList<Employee>>() {};

        ArrayList<Employee> listEmployee = new Gson().fromJson(jsonData, typeListEmployee);


        for(Employee employee : listEmployee) {
            System.out.println(employee);
        }
    }

}
