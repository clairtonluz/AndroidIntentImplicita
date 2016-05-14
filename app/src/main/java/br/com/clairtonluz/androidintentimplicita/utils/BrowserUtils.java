package br.com.clairtonluz.androidintentimplicita.utils;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

/**
 * Created by clairton on 14/05/16.
 */
public class BrowserUtils {

    public static void openWebPage(String url, Activity activity) {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(activity.getPackageManager()) != null) {
            activity.startActivity(intent);
        }
    }
}
