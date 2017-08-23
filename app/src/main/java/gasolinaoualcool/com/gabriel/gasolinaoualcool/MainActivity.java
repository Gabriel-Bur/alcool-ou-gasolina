package gasolinaoualcool.com.gabriel.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText precoAlcool;
    private EditText precoGasolina;
    private Button botaoVerificar;
    private TextView ResultadoTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoAlcool = (EditText) findViewById(R.id.TextoAlcool);
        precoGasolina = (EditText) findViewById(R.id.TextoGasolina);
        botaoVerificar = (Button) findViewById(R.id.ButtonVerificar);
        ResultadoTexto = (TextView) findViewById(R.id.TextoResultado);


        botaoVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            try {
            Double valorAlcool = Double.parseDouble(precoAlcool.getText().toString());
            Double valorGasolina = Double.parseDouble(precoGasolina.getText().toString());

            Double resultadoCalculo = valorAlcool/ valorGasolina;

                if (resultadoCalculo>=0.7){
                    ResultadoTexto.setText("É melhor utilizar Gasolina");
                }else{
                    ResultadoTexto.setText("É melhor utilizar o Alcool");
                }

            }catch (Exception e){
                ResultadoTexto.setText("Digite um valor válido.");
            }
            }
        });

    }
}
