package id.sch.smktelkom_mlg.project.xirpl208172635.marbelhijaiyah;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;

public class HarokatKasroh extends Activity {
    public ImageView preview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harokat_kasroh);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ImageButton isatu = (ImageButton) findViewById(R.id.isatu);
        preview = (ImageView) findViewById(R.id.previewKasroh);
        isatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.i1);
            }
        });

        ImageButton idua = (ImageButton) findViewById(R.id.idua);
        preview = (ImageView) findViewById(R.id.previewKasroh);
        idua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.i2);
            }
        });

        ImageButton itiga = (ImageButton) findViewById(R.id.itiga);
        preview = (ImageView) findViewById(R.id.previewKasroh);
        itiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.i3);
            }
        });

        ImageButton iempat = (ImageButton) findViewById(R.id.iempat);
        preview = (ImageView) findViewById(R.id.previewKasroh);
        iempat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.i4);
            }
        });

        ImageButton ilima = (ImageButton) findViewById(R.id.ilima);
        preview = (ImageView) findViewById(R.id.previewKasroh);
        ilima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.i5);
            }
        });

        ImageButton ienam = (ImageButton) findViewById(R.id.ienam);
        preview = (ImageView) findViewById(R.id.previewKasroh);
        ienam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.i6);
            }
        });

        ImageButton itujuh = (ImageButton) findViewById(R.id.itujuh);
        preview = (ImageView) findViewById(R.id.previewKasroh);
        itujuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.i7);
            }
        });

        ImageButton idelapan = (ImageButton) findViewById(R.id.idelapan);
        preview = (ImageView) findViewById(R.id.previewKasroh);
        idelapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.i8);
            }
        });


    }
}
