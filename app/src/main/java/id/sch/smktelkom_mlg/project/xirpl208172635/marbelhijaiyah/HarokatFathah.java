package id.sch.smktelkom_mlg.project.xirpl208172635.marbelhijaiyah;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;

public class HarokatFathah extends Activity {
    public ImageView preview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harokat_fathah);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ImageButton satu = (ImageButton) findViewById(R.id.satu);
        preview = (ImageView) findViewById(R.id.previewFathah);
        satu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.a1);
            }
        });

        ImageButton dua = (ImageButton) findViewById(R.id.dua);
        preview = (ImageView) findViewById(R.id.previewFathah);
        dua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.a2);
            }
        });

        ImageButton tiga = (ImageButton) findViewById(R.id.tiga);
        preview = (ImageView) findViewById(R.id.previewFathah);
        tiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.a3);
            }
        });

        ImageButton empat = (ImageButton) findViewById(R.id.empat);
        preview = (ImageView) findViewById(R.id.previewFathah);
        empat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.a4);
            }
        });

        ImageButton lima = (ImageButton) findViewById(R.id.lima);
        preview = (ImageView) findViewById(R.id.previewFathah);
        lima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.a5);
            }
        });

        ImageButton enam = (ImageButton) findViewById(R.id.enam);
        preview = (ImageView) findViewById(R.id.previewFathah);
        enam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.a6);
            }
        });

        ImageButton tujuh = (ImageButton) findViewById(R.id.tujuh);
        preview = (ImageView) findViewById(R.id.previewFathah);
        tujuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.a7);
            }
        });

        ImageButton delapan = (ImageButton) findViewById(R.id.delapan);
        preview = (ImageView) findViewById(R.id.previewFathah);
        delapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.a8);
            }
        });

    }
}
