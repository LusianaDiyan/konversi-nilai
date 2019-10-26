package applusiana.konversinilai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class bilanganPrima extends AppCompatActivity {

    Button btnTampil;
    TextView tvderet;
    EditText etbatas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bilangan_prima);

        btnTampil = findViewById(R.id.btnShow);
        tvderet = findViewById(R.id.tvDeret);
        etbatas = findViewById(R.id.etBatas);

        btnTampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int batas = Integer.valueOf(etbatas.getText().toString());
                String bilPrima = "";

                for (int i = 2; i < batas; i++){
                    boolean prima = true;
                    for (int j = 2; j < i; j++){
                        if (i % j == 0 ){
                            prima = false;
                        }
                    }
                    if (prima){
                        bilPrima += i + "'";
                    }
                }
                tvderet.setText(bilPrima);
            }
        });
    }
}
