package id.sch.smktelkom_mlg.project.xirpl208172635.marbelhijaiyah;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;

public class Kuis extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}
