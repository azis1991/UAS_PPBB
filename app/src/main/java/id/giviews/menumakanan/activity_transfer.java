package id.giviews.menumakanan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ImageButton;
/**
 * Created by F16 on 10/01/2018.
 */

public class activity_transfer extends AppCompatActivity {
    ImageButton b1,b2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transfer_activity);
        b1 = (ImageButton) findViewById(R.id.imageButton2);
        b2 = (ImageButton) findViewById(R.id.imageButton);

        Intent intent = getIntent();


        b1.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {



                    Toast.makeText(getApplicationContext(),"Lakukan Tranfer untuk BANK BCA Dengan No Rek. 1465266XX a/n KAROEHOEN COFFE SHOP", Toast.LENGTH_LONG).show();


            }
        });


        b2.setOnClickListener(new View.OnClickListener() {

            @Override


                public void onClick(View v) {

                    Toast.makeText(getApplicationContext(),"Lakukan Tranfer untuk BANK BNI Dengan No Rek. 18323266XX a/n KAROEHOEN COFFE SHOP", Toast.LENGTH_LONG).show();

                }

        });

    }

}
