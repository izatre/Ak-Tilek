package com.example.ak_tilek.spiner;

import android.content.Context;

import com.example.ak_tilek.model.Schedule;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;

public class SchedualModelUtil {
    public static String loadJSONFromAsset(Context context, String fileName) {
        String json = null;
        try {
            InputStream is = context.getAssets().open(fileName);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }

    public static Schedule parseData(String json) {
        Type listType = new TypeToken<Schedule>() {
        }.getType();
        return new Gson().fromJson(json, listType);
    }
}
