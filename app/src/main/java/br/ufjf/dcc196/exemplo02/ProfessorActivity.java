package br.ufjf.dcc196.exemplo02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ProfessorActivity extends AppCompatActivity {
    private TextView txtProfMensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professor);
        txtProfMensagem = findViewById(R.id.txt_prof_mensagem);
        Bundle extras = getIntent().getExtras();
        if(extras != null){
            String nome = extras.getString(MainActivity.PESSOA_NOME);
            txtProfMensagem.setText("Olá prof. "+nome+"!");
        }
        Toast.makeText(getApplicationContext(), "prof onCreate()",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "prof onStart()",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "prof onResume()",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "prof onPause()",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "prof onStop()",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "prof onRestart()",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "prof onDestroy()",Toast.LENGTH_SHORT).show();

    }
}
