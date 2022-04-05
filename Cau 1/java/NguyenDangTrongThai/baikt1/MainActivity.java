package NguyenDangTrongThai.baikt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void OnButtonClick(View v) {
        Button btnLogin = (Button) findViewById(R.id.btnLogin);
        EditText edUN = (EditText) findViewById(R.id.edUsername);
        EditText edPW = (EditText) findViewById(R.id.edPassword);
        //lấy dữ liệu
        String username = edUN.getText().toString();
        String password = edPW.getText().toString();
        if (username == "maicuongtho" && password == "Cntt60ntu!") {
            Toast toast = Toast.makeText(MainActivity.this, "User and Password is correct", Toast.LENGTH_LONG);
        } else {
            Toast toast = Toast.makeText(MainActivity.this, "User and Password is wrong", Toast.LENGTH_LONG);
        }
    }
}