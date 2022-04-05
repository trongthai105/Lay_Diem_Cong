package NguyenDangTrongThai.baikt2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OnButtonClick(View v) {
        Integer kq;
        Button btnTinh = (Button) findViewById(R.id.btnTinh);
        RadioGroup nut = (RadioGroup) findViewById(R.id.RadioGroup);
        RadioButton nut1 = (RadioButton) findViewById(R.id.nut1);
        RadioButton nut2 = (RadioButton) findViewById(R.id.nut2);
        RadioButton nut3 = (RadioButton) findViewById(R.id.nut3);
        EditText edED1 = (EditText) findViewById(R.id.ed1);
        //lấy dữ liệu
        String tien = edED1.getText().toString();

        if (nut = nut1) {
            Toast toast = Toast.makeText(MainActivity.this, "Your tip will be $", Toast.LENGTH_LONG);
        } else {
            Toast toast = Toast.makeText(MainActivity.this, "Your tip will be $", Toast.LENGTH_LONG);
        }
    }
}