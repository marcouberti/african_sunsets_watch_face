package com.marcouberti.sunsetswatchface;

import android.content.Context;

import java.util.HashMap;

public class BitmapWatchFaceUtils {

    static HashMap<String, Integer> map = new HashMap<>();
    static {
        map.put("Baobab",0);
        map.put("Birds",1);
        map.put("Buffalo",3);
        map.put("Cranes flight",4);
        map.put("Elephants",5);
        map.put("Lion",6);
        map.put("Rhino",7);
        map.put("Lemur",8);
        map.put("Gorilla",9);
    }

    public static int getBitmapResource(Context ctx, int imageID) {
        if (imageID == 1) {
            return R.drawable.africa_2;
        } else if (imageID == 3) {
            return R.drawable.africa_3;
        }else if (imageID == 0) {
            return R.drawable.africa;
        }else if (imageID == 5) {
            return R.drawable.africa_7;
        }else if (imageID == 6) {
            return R.drawable.africa_8;
        }else if (imageID == 7) {
            return R.drawable.africa_9;
        }else if (imageID == 8) {
            return R.drawable.africa_10;
        }else if (imageID == 9) {
            return R.drawable.africa_11;
        }
        else {
            return R.drawable.africa_5;
        }
    }

    public static int getBitmapPreviewResource(Context ctx, int imageID) {
        if (imageID == 1) {
            return R.drawable.preview_africa_2;
        } else if (imageID == 3) {
            return R.drawable.preview_africa_3;
        }else if (imageID == 0) {
            return R.drawable.preview_africa;
        }else if (imageID == 5) {
            return R.drawable.preview_africa_7;
        }else if (imageID == 6) {
            return R.drawable.preview_africa_8;
        }else if (imageID == 7) {
            return R.drawable.preview_africa_9;
        }else if (imageID == 8) {
            return R.drawable.preview_africa_10;
        }else if (imageID == 9) {
            return R.drawable.preview_africa_11;
        }
        else {
            return R.drawable.preview_africa_5;
        }
    }

    public static int getBitmapResource(Context ctx, String colorName) {
        if(colorName == null || !map.containsKey(colorName)) return R.drawable.africa_5;
        return getBitmapResource(ctx, map.get(colorName));
    }

    public static int getBitmapPreviewResource(Context ctx, String colorName) {
        if(colorName == null || !map.containsKey(colorName)) return R.drawable.preview_africa_5;
        return getBitmapPreviewResource(ctx, map.get(colorName));
    }

    public static int getColorID(String colorName) {
        return map.get(colorName);
    }
}
