package br.com.clairtonluz.androidintentimplicita;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import br.com.clairtonluz.androidintentimplicita.utils.BrowserUtils;
import br.com.clairtonluz.androidintentimplicita.utils.FileUtils;
import br.com.clairtonluz.androidintentimplicita.utils.MailUtils;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_IMAGE_GET = 1;
    public static final String MEU_BLOG = "http://blog.clairtonluz.com.br";
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);
    }

    public void sendMail(View view) {
        String[] address = {"clairton.c.l@gmail.com"};
        String body = "Email apenas de teste para o trabalho de android";
        MailUtils.composeEmail(address, "Email de teste", body, this);
    }

    public void choosePhoto(View view) {
        FileUtils.selectPhoto(REQUEST_IMAGE_GET, this);
    }

    public void openBlog(View view) {
        BrowserUtils.openWebPage(MEU_BLOG, this);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_IMAGE_GET && resultCode == RESULT_OK) {
            Uri fullPhotoUri = data.getData();
            imageView.setImageURI(fullPhotoUri);
        }
    }
}
