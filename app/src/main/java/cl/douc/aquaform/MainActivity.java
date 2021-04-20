package cl.douc.aquaform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnGf3 = findViewById(R.id.btnGf3);
        Button btnSgr = findViewById(R.id.btnSgr);


        btnGf3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intento1 = new Intent(MainActivity.this,ActivityGf3.class);
                startActivity(intento1);

            }
        });

        btnSgr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intento1 = new Intent(MainActivity.this,ActivitySgr.class);
                startActivity(intento1);

            }
        });



    }
}