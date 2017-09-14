package com.neri.alexa.cartaovacina;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button  buttonCartao =  (Button) findViewById(R.id.buttonTelaCartao);
        buttonCartao.setOnClickListener(this);


    }
    public void onClick(View v){

        Intent it = new Intent (this, CadastroActivity.class);
        startActivity(it);

    }

}
