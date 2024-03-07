package co.edu.unipiloto.avances;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class iniciarsesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion);
    }

    public void PasarInicio(View view){
        Intent intent = new Intent(this, inicioPublicacion.class);
        startActivity(intent);
    }
}