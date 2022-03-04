package e.reto1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    private Button buttonOM;
    private EditText editTextOM;
    private Switch switchOM;
    private CheckBox checkBoxOM1;
    private CheckBox checkBoxOM2;
    private CheckBox checkBoxOM3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonOM =findViewById(R.id.boton);
        editTextOM = findViewById(R.id.inputTexto);
        switchOM = findViewById(R.id.validacion);
        checkBoxOM1 = findViewById(R.id.check1);
        checkBoxOM2 = findViewById(R.id.check2);
        checkBoxOM3 = findViewById(R.id.check3);
    }
}