package com.itca.semana_5_daute_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText txtcod, txtdes, txtprec;
    private Button guardar, consultaCod, consultaDesc, borrar, modificar, salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtcod = findViewById(R.id.txtcod);
        txtdes = findViewById(R.id.txtdes);
        txtprec = findViewById(R.id.txtprec);

        guardar = findViewById(R.id.guardar);
        consultaCod = findViewById(R.id.consultaCod);
        consultaDesc = findViewById(R.id.consultaDesc);
        borrar = findViewById(R.id.borrar);
        modificar = findViewById(R.id.modificar);
        salir = findViewById(R.id.salir);

        guardar.setOnClickListener(this);
        consultaCod.setOnClickListener(this);
        consultaDesc.setOnClickListener(this);
        borrar.setOnClickListener(this);
        modificar.setOnClickListener(this);
        salir.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        String codigo = txtcod.getText().toString();
        String descripcion = txtdes.getText().toString();
        String precio = txtprec.getText().toString();

        if (codigo.isEmpty()){
            txtcod.setError("Campo obligatòrio");
        }else if(descripcion.isEmpty()){
            txtdes.setError("Campo obligatòrio");
        }else if(precio.isEmpty()){
            txtprec.setError("Campo obligatòrio");
        }else {
            Toast.makeText(this, "Validaciòn correcta", Toast.LENGTH_SHORT).show();
        }

        switch (view.getId()){
            case R.id.guardar:
                Toast.makeText(this, "Has hecho clic en boton guardar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.consultaCod:
                Toast.makeText(this, "Has hecho clic en boton consulta por còdigo", Toast.LENGTH_SHORT).show();
                break;
            case R.id.consultaDesc:
                Toast.makeText(this, "Has hecho clic en boton consulta por descripciòn", Toast.LENGTH_SHORT).show();
                break;
            case R.id.borrar:
                Toast.makeText(this, "Has hecho clic en boton consulta por borrar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.modificar:
                Toast.makeText(this, "Has hecho clic en boton consulta por modificar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.salir:
                Toast.makeText(this, "Has hecho clic en boton consulta por salir", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}