package com.androbos.dosen;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private ImageView fotoDetail;
    private Bundle extras;
    private TextView namaDetail;
    private TextView acall;
    private TextView amail;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        fotoDetail = (ImageView)findViewById(R.id.fotoDetail);
        namaDetail = (TextView)findViewById(R.id.detailNama);
        acall = (TextView)findViewById(R.id.textCall);
        amail = (TextView)findViewById(R.id.textemail);

        extras = getIntent().getExtras();
        if (extras != null){
            String name = extras.getString("name");
            showDetails(name);

        }
    }
    public void showDetails(String nName){

        switch (nName){
            case "Eko Setijadi, ST., MT.":
                fotoDetail.setImageDrawable(getResources().getDrawable(R.drawable.ekoset));
                namaDetail.setText(R.string.eko);
                acall.setText(extras.getString("nomor"));


                break;
            case "Ir. Hany Boedinugroho, MT.":
                fotoDetail.setImageDrawable(getResources().getDrawable(R.drawable.hani));
                namaDetail.setText(R.string.hani);
                acall.setText(extras.getString("nomor"));
                break;
        }



    }
    public void dialPhoneNumber(String phoneNumber) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phoneNumber));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_detail, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
