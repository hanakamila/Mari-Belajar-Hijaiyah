package id.sch.smktelkom_mlg.project.xirpl208172635.marbelhijaiyah;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class BelajarHarokat extends Activity {
    ImageButton pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar_harokat);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        final MediaPlayer SuaraButton = MediaPlayer.create(this,R.raw.button);

        pindah = (ImageButton) findViewById(R.id.harokat_fathah);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SuaraButton.start();
                Intent IntenPindah = new Intent(BelajarHarokat.this, HarokatFathah.class);
                startActivity(IntenPindah);
        }
        });

        pindah = (ImageButton) findViewById(R.id.harokat_kasroh);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SuaraButton.start();
                Intent IntenPindah = new Intent(BelajarHarokat.this, HarokatKasroh.class);
                startActivity(IntenPindah);
            }
        });

        pindah = (ImageButton) findViewById(R.id.harokat_dhomah);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SuaraButton.start();
                Intent IntenPindah = new Intent(BelajarHarokat.this, HarokatDhomah.class);
                startActivity(IntenPindah);
            }
        });
    }
}
