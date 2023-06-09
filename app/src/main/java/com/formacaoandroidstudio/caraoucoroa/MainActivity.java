package com.formacaoandroidstudio.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button botaoJogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoJogar = findViewById(R.id.buttonJogar);

        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), ResultadoActivity.class);

                /* Passar dados para outra tela */
                int numero = new Random().nextInt(2);
                intent.putExtra("numero", numero);

                startActivity(intent);
            }
        });
    }
}

/**
 * Anotações:
 * Para remover a barra superior do layout (nome app)  vai em:
 * res > styles.xml > na tag style no atributo parent onde está 'DarkActionBar' vamos substituir pelo valor 'NoActionBar'.
 * Vale ressaltar que é possível criar a sua própria ActionBar.
 *
 * Vai ser adicionado um Listener diretamente no botão.
 * */
