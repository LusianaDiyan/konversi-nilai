package applusiana.konversinilai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nilaiTugas, nilaiUts, nilaiUas, etHasil;
    private Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nilaiTugas = findViewById(R.id.etTugas);
        nilaiUts = findViewById(R.id.etUts);
        nilaiUas = findViewById(R.id.etUas);
        etHasil = findViewById(R.id.etHuruf);
        btnHitung = findViewById(R.id.btnHitung);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tugas = Integer.valueOf(nilaiTugas.getText().toString());
                int uts = Integer.valueOf(nilaiUts.getText().toString());
                int uas = Integer.valueOf(nilaiUas.getText().toString());

                double nilaiAkhir = ((20.0/100.0) * tugas) + ((30.0/100.0) * uts) + ((50.0/100.0) * uas);
                Toast.makeText(MainActivity.this, nilaiAkhir+"", Toast.LENGTH_SHORT).show();
                String nilaiHuruf = konversi(nilaiAkhir);
                etHasil.setText(nilaiHuruf);
            }
        });
    }

    private String konversi (double na){
        String nilai;

        if (na >= 80){
            nilai = "A";
        } else if (na >= 61){
            nilai = "B";
        } else if (na >= 51){
            nilai = "C";
        } else if (na >= 41){
            nilai = "D";
        } else {
            nilai = "E";
        }
        return nilai;
    }

    private String konv (double pd){
        String nilai = "A";
        String predikat = "";

        switch (nilai){
            case "A":
                predikat="Sangat Memuaskan";
                break;

            case "B":
                predikat="Sangat Memuaskan";
                break;

            case "C":
                predikat="Sangat Memuaskan";
                break;

            case "D":
                predikat="Sangat Memuaskan";
                break;

            case "E":
                predikat="Sangat Memuaskan";
                break;

            default:
                predikat="";
                break;
        }
    }
}
