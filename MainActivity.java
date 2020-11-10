package id.ac.id.telkomuniversity.tass.praktikactivity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView masukkanText;
    Button buttonPindah;
    private  String KEY_NAME = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        masukkanText = (TextView) findViewById(R.id.text1);
        buttonPindah = (Button) findViewById(R.id.button4);

        buttonPindah.setOnClickListener(new View.OnClickListener() {
            Button buttonPindah = findViewById(R.id.button4);

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

        buttonPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                Button buttonPindah = (Button) findViewById(R.id.button4);
                buttonPindah.isClickable();
                switch(buttonPindah.getId()){
                    case R.id.button4:
                        if(buttonPindah.isPressed()){
                            Toast.makeText(getBaseContext(), "Input Tidak Boleh Kosong" , Toast.LENGTH_SHORT ).show();
                        }
                        else buttonPindah.setText("Input Tidak Boleh Kosong");
                        break;
                }
            }
        });
        @Override
        public void openAlertDialog(View DialogInterface) {
                new AlertDialog.Builder(this)
                        .setIcon(R.mipmap.ic_launcher)
                        .setTitle("Title Alert Dialog")
                        .setMessage("Message Alert Dialog")
                        .setPositiveButton("YA", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this, "Yakin Ingin Pindah ?", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("YA", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this, "Memilih YA", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
        }
    }
}