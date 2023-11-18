package com.tec.pokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class InformacionActivity extends AppCompatActivity {
    private ImageView imageViewInformacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);

        imageViewInformacion = findViewById(R.id.imageViewInformacion);
        Bundle bundle = getIntent().getExtras();

        String rutaImagen = "@drawable/"+bundle.getString("nombre_pokemon").toLowerCase();
        int imageRecurso = getResources().getIdentifier(rutaImagen, null, getPackageName());
        imageViewInformacion.setImageResource(imageRecurso);
    }
}