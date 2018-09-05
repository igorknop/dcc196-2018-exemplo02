package br.ufjf.dcc196.exemplo02;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ProfessorActivity extends AppCompatActivity {
    private TextView txtProfMensagem;
    private Button btnProfConfirmar;
    private EditText edtSiape;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professor);
        txtProfMensagem = (TextView) findViewById(R.id.txt_prof_mensagem);
        btnProfConfirmar = (Button) findViewById(R.id.btn_prof_confirmar);
        edtSiape = (EditText) findViewById(R.id.edt_siape);


        Bundle extras = getIntent().getExtras();
        if(extras != null){
            String nome = extras.getString(MainActivity.PESSOA_NOME);
            txtProfMensagem.setText("Olá prof. "+nome+"!");
        }

        btnProfConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultado = new Intent();
                resultado.putExtra(MainActivity.PROF_SIAPE, edtSiape.getText().toString());
                setResult(Activity.RESULT_OK, resultado);
                finish();
            }
        });


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
