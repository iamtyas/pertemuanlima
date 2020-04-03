package com.example.pertemuanlima;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;

public class KirimActivity extends AppCompatActivity {

    private EditText editNama;
    private EditText editNomor;
    private EditText editEmail;
    private EditText editDeadline;
    private EditText editJudul;
    private ScrollView scrolldeskripsi;
    private EditText editDeskripsi;
    private Button btnKirim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kirim);
        initView();

        btnKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = editNama.getText().toString();
                String nomor = editNomor.getText().toString();
                String email = editEmail.getText().toString();
                String deadline = editDeadline.getText().toString();
                String judul = editJudul.getText().toString();
                String deskripsi = editDeskripsi.getText().toString();
                String myNumber = "6281326002385";
                String pesan = "Detail Pemesanan TugasKu\n\nNama "+nama+"\nNomor Telepon "+nomor+"\nEmail "+email+"\n\nDeadline "
                        +deadline+"\n\nJudul Tugas "+judul+"\n\nDeskripsi Tugas\n"+deskripsi;
                Intent send =new Intent(Intent.ACTION_SEND);
                send.setType("text/plain");
                send.putExtra(Intent.EXTRA_TEXT,pesan);
                send.putExtra("jid", myNumber + "@s.whatsapp.net");
                send.setPackage("com.whatsapp");
                startActivity(send);
            }
        });
    }

    private void initView() {
        editNama = findViewById(R.id.edit_nama);
        editNomor = findViewById(R.id.edit_nomor);
        editEmail = findViewById(R.id.edit_email);
        editDeadline = findViewById(R.id.edit_deadline);
        editJudul = findViewById(R.id.edit_judul);
        scrolldeskripsi = findViewById(R.id.scrolldeskripsi);
        editDeskripsi = findViewById(R.id.edit_deskripsi);
        btnKirim = findViewById(R.id.btn_kirim);
    }

}
