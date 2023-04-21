package com.formacaoandroidstudio.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView imagemResultado;
    private Button botaoVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imagemResultado = findViewById(R.id.imageMoeda);
        botaoVoltar = findViewById(R.id.buttonVoltar);

        // Recuperar Dados
        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("numero");

        if(numero == 0){
            imagemResultado.setImageResource(R.drawable.moeda_cara);
        }else{
            imagemResultado.setImageResource(R.drawable.moeda_coroa);
        }

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Esse método encerra a activity atual e mostra a activity da última posição da pilha.
                finish();
            }
        });
    }
}
