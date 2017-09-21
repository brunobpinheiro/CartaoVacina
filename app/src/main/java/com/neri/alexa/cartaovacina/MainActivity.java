package com.neri.alexa.cartaovacina;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.buttonCadastro:
                intent = new Intent(MainActivity.this, CadastroActivity.class);
                startActivity(intent);
                break;

            case R.id.buttonImc:
                intent = new Intent(MainActivity.this, ImcActivity.class);
                startActivity(intent);
                break;
        }
    }
}
