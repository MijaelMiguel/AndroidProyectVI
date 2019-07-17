package com.example.administrador.laboratoriohttpurlconnection;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn1 = findViewById(R.id.LogBtnLogin);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Myhilo().execute();
            }
        });
    }


    public class Myhilo extends AsyncTask<String,String,String>{

        ProgressDialog dig;

        @Override
        protected void onPreExecute() {
            //super.onPreExecute();
            dig = new ProgressDialog(LoginActivity.this);
            dig.setTitle("BBVA");
            dig.setMessage("Validando Usuario......");
            dig.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            dig.show();
        }

        @Override
        protected String doInBackground(String... strings) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            //super.onPostExecute(s);
            if (dig.isShowing()){
                dig.dismiss();
            }
            Intent x = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(x);

        }
    }

}



