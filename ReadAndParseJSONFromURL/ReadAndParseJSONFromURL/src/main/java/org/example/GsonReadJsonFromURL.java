package org.example;

import java.io.InputStreamReader;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
public class GsonReadJsonFromURL {

    public static void main(String[] args) {

        try {

            URL url = new URL("http://worldtimeapi.org/api/timezone/Asia/Kolkata");

            InputStreamReader reader = new InputStreamReader(url.openStream());

            JsonObject jsonObject = new Gson().fromJson(reader, JsonObject.class);

            System.out.println("Current date time is: " +
                    jsonObject.get("datetime").getAsString());

            reader.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}
