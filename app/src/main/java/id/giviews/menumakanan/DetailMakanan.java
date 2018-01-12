package id.giviews.menumakanan;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMakanan extends AppCompatActivity {
    Button b1;
    ImageView imgdetailmakanan;
    TextView txtdetailnamamakanan;
    TextView txtDetalmakanan;
    TextView txthargamakanan;


    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Intent intent = getIntent();
        setContentView(R.layout.activity_detail_makanan);

        imgdetailmakanan = (ImageView) findViewById(R.id.imgdetailmakanan);


        txtdetailnamamakanan = (TextView)findViewById(R.id.txtdetailnamamakanan);
        txtDetalmakanan = (TextView)findViewById(R.id.txtdetailmakanan);
        txthargamakanan = (TextView)findViewById(R.id.txtdetailhargamakanan);

        b1 = (Button) findViewById(R.id.button);
        Intent terimadata = getIntent();

        txtdetailnamamakanan.setText(terimadata.getStringExtra("namaM"));
        txthargamakanan.setText(terimadata.getStringExtra("hargaM"));
        txtDetalmakanan.setText(terimadata.getIntExtra("detailM",0));
        imgdetailmakanan.setImageResource (terimadata.getIntExtra("gbrM",0));



        b1.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),BayarMakanan.class);
                String txt =(String) txthargamakanan.getText();
                String txt2 =(String) txtdetailnamamakanan.getText();
                intent.putExtra("namaM", txt2);
                intent.putExtra("hargaM", txt);
                startActivity(intent);
            }
        });

    }

}
