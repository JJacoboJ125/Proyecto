package co.edu.unipiloto.avances;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class formularioCarga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_carga);
    }

    public void seguiaADestino(View view){
        Intent intent = new Intent(this, formCargaDestino.class);
        startActivity(intent);
    }
}