package com.example.soaldataintentwithsplash;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Pesanan extends AppCompatActivity {

    public static String EXTRA_DATA = "extra_data";
    TextView txtNamaKu, txtAlamatKu, txtPesananKu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesanan);

        txtNamaKu = findViewById(R.id.txt_namaResult);
        txtAlamatKu = findViewById(R.id.txt_alamatResult);
        txtPesananKu = findViewById(R.id.txt_pesananResult);

        DataOrder mOrder = getIntent().getParcelableExtra(EXTRA_DATA);

        String nama = mOrder.getNama();
        String alamat = mOrder.getAlamat();
        String pesanan = mOrder.getPesanan();

        txtNamaKu.setText(nama);
        txtAlamatKu.setText(alamat);
        txtPesananKu.setText(pesanan);
    }
}
