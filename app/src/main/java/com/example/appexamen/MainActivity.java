package com.example.appexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtNombre;
    private EditText txtBaseRectangulo;
    private EditText txtAlturaRectangulo;
    private Button btnLimpiar;
    private Button btnSiguiente;
    private Button btnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniciar();

        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtNombre.getText().toString().matches("") &&
                txtBaseRectangulo.getText().toString().matches("") &&
                txtAlturaRectangulo.getText().toString().matches("")){

                    Toast.makeText(MainActivity.this, "Algunos campos estan vacios", Toast.LENGTH_SHORT).show();

                }else{
                    txtNombre.setText("");
                    txtBaseRectangulo.setText("");
                    txtAlturaRectangulo.setText("");

                    Toast.makeText(MainActivity.this, "Campos vacios", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(txtNombre.getText().toString().matches("") &&
                        txtBaseRectangulo.getText().toString().matches("") &&
                        txtAlturaRectangulo.getText().toString().matches("")){

                    Toast.makeText(MainActivity.this, "Algunos campos estan vacios", Toast.LENGTH_SHORT).show();
                }else{

                    String nombreIn = txtNombre.getText().toString();
                    String baseIn = txtBaseRectangulo.getText().toString();
                    String alturaIn = txtAlturaRectangulo.getText().toString();

                    Intent intent = new Intent(MainActivity.this, RectanguloActivity.class);
                    intent.putExtra("Nombre",nombreIn);
                    intent.putExtra("Base",baseIn);
                    intent.putExtra("Altura",alturaIn);

                    startActivity(intent);
                }

            }
        });

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
    private void iniciar(){
        txtNombre = (EditText) findViewById(R.id.txtNombre);
        txtBaseRectangulo = (EditText) findViewById(R.id.txtBaseRectangulo);
        txtAlturaRectangulo = (EditText) findViewById(R.id.txtAlturaRectangulo);
        btnLimpiar = (Button) findViewById(R.id.btnLimpiar);
        btnSiguiente = (Button) findViewById(R.id.btnSiguiente);
        btnSalir = (Button) findViewById(R.id.btnSalir);
    }

}