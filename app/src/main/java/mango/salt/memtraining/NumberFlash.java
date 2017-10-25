package mango.salt.memtraining;

import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.widget.Toast;

public class NumberFlash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_flash);

        Bundle bundle = getIntent().getExtras();
        int a = bundle.getInt("a");
        Toast.makeText(this, a+"", Toast.LENGTH_SHORT).show();
       int b = bundle.getInt("b");

        Toast.makeText(this, b+"" , Toast.LENGTH_SHORT).show();
        screenSize();
    }


    public  void  screenSize(){
        Display mdisp = getWindowManager().getDefaultDisplay();
        Point mdispSize = new Point();
        mdisp.getSize(mdispSize);
        int maxX = mdispSize.x;
        int maxY = mdispSize.y;
        Toast.makeText(this, "x " + maxX + "---"+"y " +maxY , Toast.LENGTH_LONG ).show();
    }
}
