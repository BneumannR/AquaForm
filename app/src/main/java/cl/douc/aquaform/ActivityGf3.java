package cl.douc.aquaform;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class ActivityGf3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_gf3);

       // Formula GF3 para sacar peso final Wf = ((GF3 x t x To/1000) + Wi 1/3)3

        ImageView btnVolverInicio = findViewById(R.id.iviewInicio);
        Button ButtoncalculaGf3 = findViewById(R.id.btnCalculaGf3);
        EditText txtPesoInicialGf3 = findViewById(R.id.txtPesoInicial);
        EditText txtDiasGf3 = findViewById(R.id.txtDias);
        EditText txtTemperaturaGf3 = findViewById(R.id.txtTemperatura);
        TextView txtResultadoGf3 = findViewById(R.id.txtResultadoGf3);



        // boton volver boton inicio con imageView
        btnVolverInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intento2 = new Intent(ActivityGf3.this, MainActivity.class);
                startActivity(intento2);
            }
        });

        ButtoncalculaGf3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // Wf = ((GF3 x dias x Temperatura/1000) + Wi 1/3)3
                String pesoInicial = txtPesoInicialGf3.getText().toString();
                double pesoInicial2 = Double.parseDouble(pesoInicial);
                String temperatura = txtTemperaturaGf3.getText().toString();
                double temperatura2 = Double.parseDouble(temperatura);
                String dias = txtDiasGf3.getText().toString();
                double dias2 = Double.parseDouble(dias);
             //   double resultado = Math.round(Math.pow(((2.9 * dias2 * temperatura2) / 1000)  +(Math.pow(pesoInicial2,(0.3333))),3))  ;
//                double resultado2 = ((resultado ) /1000) ;
//                double resultado3 = resultado2+ ( Math.pow(pesoInicial2,(0.3333)));
                //double resultado4 = Math.round(Math.pow(resultado,3));


//                Rango peso	gf3
//                1 a 80	3,1
//                81 a 150	3
//                150 a 400 	2,9
//                401 a 1000	2,93
//                1001 a 1300	2,9
//                1301 a 2000	2,8
//                2001 a 2800	2,7
//                2801 a 3800	2,6
//                3801 a 5000	2,5
//                5001 a 7000	2,4

                if(temperatura2 == 0)
                {
                    Toast.makeText(ActivityGf3.this, "Ingresar una temperatura mayor que cero !!!", Toast.LENGTH_SHORT).show();
                }
                if (dias2 == 0)
                {
                    Toast.makeText(ActivityGf3.this, "Ingresar un numero mayor que cero !!!", Toast.LENGTH_SHORT).show();
                }
                if(pesoInicial2 == 0)
                {
                    Toast.makeText(ActivityGf3.this, "Ingresar un peso mayor a cero !!!", Toast.LENGTH_SHORT).show();
                }
                if (pesoInicial2 > 1 && pesoInicial2 < 80 && dias2 >1 && dias2 <= 30 )
                {
                   double resultado = Math.round(Math.pow(((3.1 * dias2 * temperatura2) /1000) +(Math.pow(pesoInicial2,(0.3333))),3)) ;
                    String resultadoX = String.valueOf(resultado);
                    txtResultadoGf3.setText("El peso esperado es: " + resultadoX + " Gramos");
                }
                if (pesoInicial2 > 1 && pesoInicial2 < 80 && dias2 >31 && dias2 < 60 )
                {
                    double resultado =  Math.round(Math.pow(((3.0 * dias2 * temperatura2) /1000) +(Math.pow(pesoInicial2,(0.3333))),3)) ;
                    String resultadoX = String.valueOf(resultado);
                    txtResultadoGf3.setText("El peso esperado es: " + resultadoX + " Gramos");
                }

                if (pesoInicial2 > 1 && pesoInicial2 < 80 && dias2 >31 && dias2 < 60 )
                {
                    double resultado = Math.round(Math.pow(((3 * dias2 * temperatura2) /1000) +(Math.pow(pesoInicial2,(0.3333))),3)) ;
                    String resultadoX = String.valueOf(resultado);
                    txtResultadoGf3.setText("El peso esperado es: " + resultadoX + " Gramos");
                }




                if(pesoInicial2 > 81 && pesoInicial2 < 150 )
                {
                    double resultado = Math.round(Math.pow(((3 * dias2 * temperatura2) /1000) +(Math.pow(pesoInicial2,(0.3333))),3)) ;
                    String resultadoX = String.valueOf(resultado);
                    txtResultadoGf3.setText("El peso esperado es: " + resultadoX + " Gramos");
                }
                if(pesoInicial2 > 151 && pesoInicial2 < 1300)
                {
                    double resultado = Math.round(Math.pow(((2.9 * dias2 * temperatura2) /1000) +(Math.pow(pesoInicial2,(0.3333))),3)) ;
                    String resultadoX = String.valueOf(resultado);
                    txtResultadoGf3.setText("El peso esperado es: " + resultadoX + " Gramos");
                }
                if(pesoInicial2 > 1301 && pesoInicial2 < 2000)
                {
                    double resultado = Math.round(Math.pow(((2.8 * dias2 * temperatura2) /1000) +(Math.pow(pesoInicial2,(0.3333))),3)) ;
                    String resultadoX = String.valueOf(resultado);
                    txtResultadoGf3.setText("El peso esperado es: " + resultadoX + " Gramos");
                }
                if(pesoInicial2 > 2001 && pesoInicial2 < 2800)
                {
                    double resultado = Math.round(Math.pow(((2.7 * dias2 * temperatura2) /1000) +(Math.pow(pesoInicial2,(0.3333))),3)) ;
                    String resultadoX = String.valueOf(resultado);
                    txtResultadoGf3.setText("El peso esperado es: " + resultadoX + " Gramos");
                }
                if(pesoInicial2 > 2801 && pesoInicial2 < 3800)
                {
                    double resultado = Math.round(Math.pow(((2.6 * dias2 * temperatura2) /1000) +(Math.pow(pesoInicial2,(0.3333))),3)) ;
                    String resultadoX = String.valueOf(resultado);
                    txtResultadoGf3.setText("El peso esperado es: " + resultadoX + " Gramos");
                }
                if(pesoInicial2 > 3801 && pesoInicial2 < 5000)
                {
                    double resultado = Math.round(Math.pow(((2.5 * dias2 * temperatura2) /1000) +(Math.pow(pesoInicial2,(0.3333))),3)) ;
                    String resultadoX = String.valueOf(resultado);
                    txtResultadoGf3.setText("El peso esperado es: " + resultadoX + " Gramos");
                }
                if(pesoInicial2 > 5001 && pesoInicial2 < 7000)
                {
                    double resultado = Math.round(Math.pow(((2.4 * dias2 * temperatura2) /1000) +(Math.pow(pesoInicial2,(0.3333))),3)) ;
                    String resultadoX = String.valueOf(resultado);
                    txtResultadoGf3.setText("El peso esperado es: " + resultadoX + " Gramos");
                }





            }
        });





    }
}