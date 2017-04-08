package com.androidtutoriels.textviewexercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView reussi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reussi = (TextView)findViewById(R.id.le_texte);
        reussi.setText("J'ai réussi! ouais!");

        ImageView image = (ImageView)findViewById(R.id.imageView);
        image.setImageResource(R.drawable.android1);

        Button button = (Button)findViewById(R.id.button);

    }

    public void onClic(View view){
        reussi.setText("J'ai cliqué sur le bouton");
    }






}
