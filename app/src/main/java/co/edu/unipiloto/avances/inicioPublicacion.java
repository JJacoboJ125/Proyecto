package co.edu.unipiloto.avances;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class inicioPublicacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_publicacion);
    }

    public void llenarPublicacion(View view){
        Intent intent = new Intent(this, formularioCarga.class);
        startActivity(intent);
    }
}