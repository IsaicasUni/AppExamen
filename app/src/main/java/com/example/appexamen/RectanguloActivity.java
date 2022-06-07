package com.example.appexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class RectanguloActivity extends AppCompatActivity {

    private TextView lblNombre;
    private TextView lblAltura;
    private TextView lblBase;
    private TextView mostrarResultado;
    private RadioButton rdbtnArea;
    private RadioButton rdbtnPerimetro;
    private Button btnCalcular;
    private Button btnRegresar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo);
        iniciar();

        Rectangulo rectangulo = new Rectangulo();

        Bundle bundle = getIntent().getExtras();
        String nombreIn = bundle.getString("Nombre");
        String baseIn = bundle.getString("Base");
        String alturaIn = bundle.getString("Altura");

        lblNombre.setText("Nombre: " + nombreIn);
        lblBase.setText("Base: " + baseIn);
        lblAltura.setText("Altura: " + alturaIn);

        float numBase = Float.parseFloat(baseIn);
        rectangulo.setBase(numBase);

        float numAltura = Float.parseFloat(alturaIn);
        rectangulo.setAltura(numAltura);

        RadioButton radioButtonArea = (RadioButton) findViewById(R.id.rdbtnArea);
        RadioButton radioButtonPerimetro = (RadioButton) findViewById(R.id.rdbtnPerimetro);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(radioButtonArea.isChecked()){

                    mostrarResultado.setText("El Area es: " + rectangulo.calculoArea());

                }
                else if(radioButtonPerimetro.isChecked()){

                    mostrarResultado.setText("El Perimetro es: " + rectangulo.calculoPerimetro());

                }
                else {

                    Toast.makeText(RectanguloActivity.this, "Seleccione una opcion", Toast.LENGTH_SHORT).show();

                }
            }
        });

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
    private void iniciar(){
        lblNombre = (TextView) findViewById(R.id.lblNombre);
        lblAltura = (TextView) findViewById(R.id.lblAltura);
        lblBase = (TextView) findViewById(R.id.lblBase);
        mostrarResultado = (TextView) findViewById(R.id.mostrarResultado);
        rdbtnArea = (RadioButton) findViewById(R.id.rdbtnArea);
        rdbtnPerimetro = (RadioButton) findViewById(R.id.rdbtnPerimetro);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);
        btnRegresar = (Button) findViewById(R.id.btnRegresar);
    }
}