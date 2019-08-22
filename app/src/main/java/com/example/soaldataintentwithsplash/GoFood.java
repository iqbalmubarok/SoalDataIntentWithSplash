package com.example.soaldataintentwithsplash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GoFood extends AppCompatActivity implements View.OnClickListener {

    public Button btnOrder;
    TextView txtNama, txtAlamat, txtPesanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_food);

        btnOrder = findViewById(R.id.btn_order);
        btnOrder.setOnClickListener(this);

        txtNama = findViewById(R.id.txt_nama);
        txtAlamat = findViewById(R.id.txt_alamat);
        txtPesanan = findViewById(R.id.txt_pesanan);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btn_order:
                DataOrder mDataOrder = new DataOrder();
                mDataOrder.setNama(txtNama.getText().toString());
                mDataOrder.setAlamat(txtAlamat.getText().toString());
                mDataOrder.setPesanan(txtPesanan.getText().toString());
                Intent orderIntent = new Intent(GoFood.this, Pesanan.class);

                orderIntent.putExtra(Pesanan.EXTRA_DATA, mDataOrder);

                startActivity(orderIntent);
                break;
        }
    }
}
