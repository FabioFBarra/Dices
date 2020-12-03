package dices.cursoandroid.com.dices;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Time;
import java.util.Date;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button botao4;
    private Button botao6;
    private Button botao100;
    private TextView tela4;
    private TextView tela6;
    private TextView tela100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        botao4 = (Button) findViewById(R.id.botao4Id);
        botao6 = (Button) findViewById(R.id.botao6Id); 
        botao100 = (Button) findViewById(R.id.botao100Id);
        tela4 = (TextView) findViewById(R.id.tela4Id);
        tela6 = (TextView) findViewById(R.id.tela6Id);
        tela100 = (TextView) findViewById(R.id.tela100Id);
        
        botao4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer valor = new Random().nextInt(4)+1;
                String valorTexto = Integer.toString(valor);
                tela4.setText(valorTexto);
                Toast.makeText(getApplicationContext(), valorTexto, Toast.LENGTH_SHORT).show();
            }
        });
        
        botao6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                tela6.setText("" + (new Random().nextInt(6)+1));
            }
        });
        
        botao100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tela100.setText("" + (new Random().nextInt(100)+1));
            }
        });
    }
}
