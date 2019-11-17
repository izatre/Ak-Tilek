package com.example.ak_tilek.cources;

import android.content.Context;

import com.example.ak_tilek.model.Schedule;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.List;

public class Util {

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
        public static List<CoursesModel> parseData(String json) {
            Type listType = new TypeToken<List<CoursesModel>>() {
            }.getType();
            return new Gson().fromJson(json, listType);
        }
    }


