package id.sch.smktelkom_mlg.project.xirpl208172635.marbelhijaiyah;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class Belajar extends Activity {

    ImageButton pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final MediaPlayer SuaraButton = MediaPlayer.create(this, R.raw.button);

        pindah = (ImageButton) findViewById(R.id.hijaiyah1);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SuaraButton.start();
                Intent IntenPindah = new Intent(Belajar.this, BelajarHijaiyah.class);
                startActivity(IntenPindah);
            }
        });

        pindah = (ImageButton) findViewById(R.id.hijaiyah2);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SuaraButton.start();
                Intent IntenPindah = new Intent(Belajar.this, BelajarHarokat.class);
                startActivity(IntenPindah);
            }
        });

        pindah = (ImageButton) findViewById(R.id.hijaiyah3);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SuaraButton.start();
                Intent IntenPindah = new Intent(Belajar.this, BelajarTanwin.class);
                startActivity(IntenPindah);
            }
        });

    }
}
