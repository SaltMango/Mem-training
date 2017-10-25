package mango.salt.memtraining;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class ShortTermVisualMemory extends AppCompatActivity {

    public int symbol;
    public int numberOfDigits;
    public EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_short_term_visual_memory);
        editText = (EditText)findViewById(R.id.editText);
    }

    public void onRadioButtonClicked(View view){
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.symbol_S_id:
                if (checked)
                    symbol = 1;
                    break;
            case R.id.symbol_ST_id:
                if (checked)
                    symbol = 2;
                    break;
            case R.id.symbol_STU_id:
                if (checked)
                    symbol = 3;
                    break;
            case R.id.symbol_STUX_id:
                if (checked)
                    symbol = 4;
                    break;
            case R.id.symbol_STUXL_id:
                if (checked)
                    symbol = 5;
                    break;
        }
    }

    public void playGame(View view) {

        String snumberOfDigits = editText.getText().toString();
        numberOfDigits = Integer.parseInt(snumberOfDigits);

        Intent intent = new Intent(ShortTermVisualMemory.this,NumberFlash.class);
        intent.putExtra("a",symbol);
        intent.putExtra("b",numberOfDigits);
        startActivity(intent);

    }
}
