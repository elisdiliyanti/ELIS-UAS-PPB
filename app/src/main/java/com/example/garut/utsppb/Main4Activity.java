package com.example.garut.utsppb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        WebView browser = (WebView) findViewById(R.id.webkit);        //Use same layout and manifest of previous example
        browser.loadData("" +
                "<html>" +
                "   <body>" +
                "  <title>About Aplikasi </title>" +
                "<p>" +
                "About Aplikasi<br>" +
                "Rukun Islam<br> <br> <br>" +
                "                          <br>" +
                "Aplikasi Pemrograman Perangkat Bergerak<br>" +
                "                          <br>" +

                "           Anggota :<br/>" +
                "               Agus Ramdan         (1406009)<br/>" +
                "               Elis Diliyanti      (1406042)<br/>" +
                "</p>" +
                "</body>" +
                "</html>", "text/html","UTF-8");

    }
}
