package com.example.galletadelafortuna;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //private View clicc;
    Button clicc;
    TextView showtex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clicc=(Button) findViewById(R.id.CLIC);
        clicc.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {



        showtex=(TextView) findViewById(R.id.SHOW);
        int seleccionar = v.getId();
        try {
            switch (seleccionar){
                case R.id.CLIC:
                    String[] premios ={"VOLVERAS CON TU EX", "TU CRUSH TE HARA CASO", "TENDRAS SALUD Y ESO ES LO IMPORTANTE","ANDARAS ARREBATA'O EN LA JEEPETA","LOGRARAS TODO LO QUE DESEAS"};
                    String alee = (premios[new Random().nextInt(premios.length)]);
                    showtex.setText(alee);
                    //System.out.println("\n"+"PUEDO VER EN TU FUTURO QUE...!  :  "+"\n"+alee);

            }

        }catch (Exception e){
            showtex.setText("Error");
        }




    }


}