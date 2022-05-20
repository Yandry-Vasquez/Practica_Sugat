package facci.yandrizambrano.practica_sugat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText editTextApellidos;
    EditText editTextNombres;
    EditText editTextCedula;
    Button buttonGuardar;
    Button buttonMostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextApellidos=findViewById(R.id.EdiTextApellidos);
        editTextNombres = findViewById(R.id.EdiTextNombres);
        editTextCedula=findViewById(R.id.EdiTextCedula);
        buttonGuardar=findViewById(R.id.ButtonGuardar);
        buttonMostrar=findViewById(R.id.ButtonMostrar);


        buttonGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Alumno alumno= new Alumno(
                        editTextApellidos.getText().toString(),
                        editTextNombres.getText().toString(),
                        editTextCedula.getText().toString()
                );
                        alumno.save();
                Log.e("Datos","Datos Guardados");

            }
        });











    }
}