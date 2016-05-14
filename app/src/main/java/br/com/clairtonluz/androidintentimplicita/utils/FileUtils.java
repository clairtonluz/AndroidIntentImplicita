package br.com.clairtonluz.androidintentimplicita.utils;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by clairton on 14/05/16.
 */
public class FileUtils {
    public static void selectPhoto(int requestId, Activity activity) {
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("image/*");
        if (intent.resolveActivity(activity.getPackageManager()) != null) {
            activity.startActivityForResult(intent, requestId);
        }
    }
}
