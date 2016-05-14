package br.com.clairtonluz.androidintentimplicita.service;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

/**
 * Created by clairton on 14/05/16.
 */
public class MailService {

    public static void composeEmail(String[] addresses, String subject, String body, Activity activity) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, addresses);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, body);
        if (intent.resolveActivity(activity.getPackageManager()) != null) {
            activity.startActivity(intent);
        }
    }
}
