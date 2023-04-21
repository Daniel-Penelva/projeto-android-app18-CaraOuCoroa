package com.formacaoandroidstudio.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

/**
 * Anotações:
 * Para remover a barra superior do layout (nome app)  vai em:
 * res > styles.xml > na tag style no atributo parent onde está 'DarkActionBar' vamos substituir pelo valor 'NoActionBar'.
 * Vale ressaltar que é possível criar a sua própria ActionBar.
 *
 *
 * */
