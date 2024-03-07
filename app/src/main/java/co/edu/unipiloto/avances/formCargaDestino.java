package co.edu.unipiloto.avances;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class formCargaDestino extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_carga_destino);
    }

    public void seguirAdatos(View view){
        Intent intent = new Intent(this, formCargaDatos.class);
        startActivity(intent);
    }
}