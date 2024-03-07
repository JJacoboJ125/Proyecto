package co.edu.unipiloto.avances;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class formCargaDatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_carga_datos);
    }

    public void llevarAmisPublicados(View view){
        String TipoCarga = String.valueOf((TextView) findViewById(R.id.tipoMercancia));


        Intent intent = new Intent(this, inicioPublicacion.class);
        startActivity(intent);
    }
}