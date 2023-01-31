package com.example.cctv;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    CardView tugu_welcome, bunderan_siyono, alun_wono, bunder_pln;
    TextView date;
    String today;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tugu_welcome = findViewById(R.id.cvTuguWelcome);
        bunderan_siyono = findViewById(R.id.cvBunderanSiyono);
        alun_wono = findViewById(R.id.cvAlunWonosari);
        bunder_pln = findViewById(R.id.cvBundaranPLN);
        date = findViewById(R.id.tvDate);

        tugu_welcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TuguWelcome.class);
                startActivity(intent);
            }
        });

        bunderan_siyono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BunderanSiyono.class);
                startActivity(intent);
            }
        });

        alun_wono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AlunWonosari.class);
                startActivity(intent);
            }
        });

        bunder_pln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BunderanPLN.class);
                startActivity(intent);
            }
        });

        Date dateNow = Calendar.getInstance().getTime();
        today = (String) DateFormat.format("EEEE", dateNow);
        if (today.equalsIgnoreCase("sunday")) {
            today = "Minggu";
        } else if (today.equalsIgnoreCase("monday")) {
            today = "Senin";
        } else if (today.equalsIgnoreCase("tuesday")) {
            today = "Selasa";
        } else if (today.equalsIgnoreCase("wednesday")) {
            today = "Rabu";
        } else if (today.equalsIgnoreCase("thursday")) {
            today = "Kamis";
        } else if (today.equalsIgnoreCase("friday")) {
            today = "Jumat";
        } else if (today.equalsIgnoreCase("saturday")) {
            today = "Sabtu";
        }
        getToday();
    }

    //membuuat parameter untuk fungsi Date
    private void getToday() {
        Date date = Calendar.getInstance().getTime();
        String tanggal = (String) DateFormat.format("d", date);//membuat fungsi tanggal
        String bulanke = (String) DateFormat.format("M", date);//membuat fungsi bulan
        String tahun = (String) DateFormat.format("yyyy", date);//membuat fungsi tahun

        int month = Integer.parseInt(bulanke);
        String bulan = null;
        if (month == 1) {
            bulan = "Januari";
        } else if (month == 2) {
            bulan = "Februari";
        } else if (month == 3) {
            bulan = "Maret";
        } else if (month == 4) {
            bulan = "April";
        } else if (month == 5) {
            bulan = "Mei";
        } else if (month == 6) {
            bulan = "Juni";
        } else if (month == 7) {
            bulan = "Juli";
        } else if (month == 8) {
            bulan = "Agustus";
        } else if (month == 9) {
            bulan = "September";
        } else if (month == 10) {
            bulan = "Oktober";
        } else if (month == 11) {
            bulan = "November";
        } else if (month == 12) {
            bulan = "Desember";

        }
    }
}