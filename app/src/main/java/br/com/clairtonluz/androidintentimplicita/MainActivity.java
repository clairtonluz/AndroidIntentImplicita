package br.com.clairtonluz.androidintentimplicita;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import br.com.clairtonluz.androidintentimplicita.service.MailService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMail(View view) {
        System.out.println("###################################");
        String[] address = {"clairton.c.l@gmail.com"};
        String body = "Email apenas de teste para o trabalho de android";
        MailService.composeEmail(address, "Email de teste", body, this);
        System.out.println("2###################################");
    }
}
