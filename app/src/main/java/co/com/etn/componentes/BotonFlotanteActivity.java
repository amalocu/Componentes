package co.com.etn.componentes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class BotonFlotanteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boton_flotante);

        getData();

    }

    private void getData() {
        Intent intent = getIntent();
        Datos dato = (Datos)intent.getSerializableExtra("objeto");
        Toast.makeText(this, dato.getNombre(), Toast.LENGTH_SHORT).show();
    }
}
