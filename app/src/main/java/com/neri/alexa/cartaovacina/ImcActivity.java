package com.neri.alexa.cartaovacina;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class ImcActivity extends AppCompatActivity {

    private Button btnResultado ;
    private EditText editPeso;
    private EditText editAltura;
    private EditText editResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);

        btnResultado =  (Button) findViewById(R.id.buttonResultado);
        editPeso =  (EditText) findViewById(R.id.editTextPeso);
        editAltura =  (EditText)findViewById(R.id.editTextAlrura);
        editResultado =  (EditText) findViewById(R.id.editTextResultado) ;

        btnResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double peso = Double.parseDouble(editPeso.getText().toString());
                double altura  = Double.parseDouble(editAltura.getText().toString());

                double resultado =  peso / (altura*altura);
                editResultado.setText(String.valueOf(resultado));
            }
        });
    }
}
