package com.example.a001_clickonbutton;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }

    //Uygulama 1 Butona tıklayınca Gazi'nin web sitesine yönlendiriliyor.
    public void siteyeGit(View view)
    {
        Intent gaziSitesi = new Intent(Intent.ACTION_VIEW, Uri.parse("http://gazi.edu.tr"));
        startActivity(gaziSitesi);
    }

    //Uygulama 2 Butona tıklayınca buton üzerinde ki text değişsin
    public void yaziDegis(View view)
    {

        Button buton1 = (Button)findViewById(R.id.yaziDegissin);
        Log.i("Bilgi","Yazı Değişti");
        buton1.setText("Değişen Text");
        buton1.setTextColor(Color.BLUE);
        buton1.setBackgroundColor(Color.RED);
    }

    //
    public void yaziRenkDegis(View view)
    {
        TextView txt2 = (TextView)findViewById(R.id.textView2);
        txt2.setTextColor(Color.RED);
        txt2.setText("GÜLE GÜLE");

    }
    //3
    public void uygulamaKapat(View view)
    {
        finish();
        System.exit(0);
    }

}
