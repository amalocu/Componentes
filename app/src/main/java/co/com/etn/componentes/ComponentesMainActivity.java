package co.com.etn.componentes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ComponentesMainActivity extends AppCompatActivity implements View.OnClickListener {

    Button  componentes_main_button_ok;
    Button  componentes_main_button_cancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_componentes_main);
        componentes_main_button_ok = (Button)findViewById(R.id.componentes_main_button_ok);
        componentes_main_button_ok.setOnClickListener(this);
        componentes_main_button_cancel = (Button)findViewById(R.id.componentes_main_button_cancel);
        componentes_main_button_cancel.setOnClickListener(this);
    }

    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.componentes_main_button_ok:
                intent = new Intent(ComponentesMainActivity.this, SpinnerActivity.class);
                startActivity(intent);
                break;
            case R.id.componentes_main_button_cancel:
                intent = new Intent(ComponentesMainActivity.this, LinearVsRelativeActivity.class);
                startActivity(intent);
                break;
            default:
                intent = new Intent(ComponentesMainActivity.this, BotonFlotanteActivity.class);
                Datos datos = new Datos();
                datos.setId(1);
                datos.setNombre("Alex");
                intent.putExtra("objeto",datos);
                startActivity(intent);
                break;
        }


    }
}
