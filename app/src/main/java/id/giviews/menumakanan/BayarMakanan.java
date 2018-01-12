package id.giviews.menumakanan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


/**
 * Created by F16 on 08/01/2018.
 */
public class BayarMakanan extends AppCompatActivity {
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bayar);
        b1 = (Button) findViewById(R.id.button2);
        b2 = (Button) findViewById(R.id.button3);
            TextView textView = (TextView) findViewById(R.id.textView3);
        TextView textView2 = (TextView) findViewById(R.id.textView5);
        Intent intent = getIntent();
        final String name2 = this.getIntent().getExtras().getString("namaM");
        final String name = this.getIntent().getExtras().getString("hargaM");
        textView.setText(name);
        textView2.setText(name2);
        b1.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),byr_tempat.class);

                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),activity_transfer.class);

                startActivity(intent);
            }
        });

    }
}
