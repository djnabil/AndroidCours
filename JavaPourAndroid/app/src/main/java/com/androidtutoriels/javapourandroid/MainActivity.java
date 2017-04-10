package com.androidtutoriels.javapourandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int a = 5;
        int b = 7;

        int c = sommeEtLog(a,b);

        Log.i("Resultat", "c = " + c);
    }

    public int sommeDeAEtB(int a, int b){
        int c = a + b;
        return c;
    }
    public void logJeSuisContent(){
        Log.i("Resultat", "je suis content");

    }
    public int sommeEtLog(int a, int b){
        int d = sommeDeAEtB(a,b);
        logJeSuisContent();
        return d;
    }

}
