package id.ac.id.telkomuniversity.tass.praktikactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView text2;
    private String nama;
    private  String KEY_NAME = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        text2 = (TextView) findViewById(R.id.textView2);
        Bundle extras = getIntent().getExtras();
        nama = extras.getString(KEY_NAME);
        text2.setText(nama);
    }
}