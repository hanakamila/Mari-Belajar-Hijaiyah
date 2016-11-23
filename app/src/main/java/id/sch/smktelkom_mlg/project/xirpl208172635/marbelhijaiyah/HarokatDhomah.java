package id.sch.smktelkom_mlg.project.xirpl208172635.marbelhijaiyah;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;

public class HarokatDhomah extends Activity {
    public ImageView preview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harokat_dhomah);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ImageButton usatu = (ImageButton) findViewById(R.id.usatu);
        preview = (ImageView) findViewById(R.id.previewDhommah);
        usatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.u1);
            }
        });

        ImageButton udua = (ImageButton) findViewById(R.id.udua);
        preview = (ImageView) findViewById(R.id.previewDhommah);
        udua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.u2);
            }
        });

        ImageButton utiga = (ImageButton) findViewById(R.id.utiga);
        preview = (ImageView) findViewById(R.id.previewDhommah);
        utiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.u3);
            }
        });

        ImageButton uempat = (ImageButton) findViewById(R.id.uempat);
        preview = (ImageView) findViewById(R.id.previewDhommah);
        uempat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.u4);
            }
        });

        ImageButton ulima = (ImageButton) findViewById(R.id.ulima);
        preview = (ImageView) findViewById(R.id.previewDhommah);
        ulima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.u5);
            }
        });

        ImageButton uenam = (ImageButton) findViewById(R.id.uenam);
        preview = (ImageView) findViewById(R.id.previewDhommah);
        uenam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.u6);
            }
        });

        ImageButton utujuh = (ImageButton) findViewById(R.id.utujuh);
        preview = (ImageView) findViewById(R.id.previewDhommah);
        utujuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.u7);
            }
        });

        ImageButton udelapan = (ImageButton) findViewById(R.id.udelapan);
        preview = (ImageView) findViewById(R.id.previewDhommah);
        udelapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preview.setImageResource(R.drawable.u8);
            }
        });


    }
}
