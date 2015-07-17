package com.androbos.dosen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity  {
    private ListView listview;
    private CustomListViewAdapter customListViewAdapter;
  final String[] namaDosen = new String[]{
            "Eko Setijadi, ST., MT., Ph.D","Ir. Hany Boedinugroho, MT.",
          "Eko Pramunanto, ST., MT.","Ir. Arif Musthofa, MT.","Slamet Budiprayitno, ST., MT.",
          "Ir. Djoko Suprajitno Rahardjo, MT.","Ir. Haris Pringadi, MT.","Ir. Josaphat Pramudijanto, M.Eng."
    };
    final String[] nip = new String[]{
            "197210012003121002","196107061987011001",
            "196612031994121001","196608111992031004","197811132010121002",
            "195506221987011001","196205101989031001","196210051990031003"
    };
    final Integer[] foto = new Integer[]{
            R.drawable.ekoset,R.drawable.hani,
            R.drawable.ekopram,R.drawable.arifmustofa,R.drawable.slamet,
            R.drawable.jokosup,R.drawable.haris,R.drawable.jos
    };
    final String[] nomorDosen = new String[]{
            "+62085334660023","+6285732508237",
            "+6281931006691","+6281216067126","+6288801733271",
            "+6281330779035","+6281335127189","+623171200207"
    };
    final String[] email = new String[]{
            "ekoset@ee.its.ac.id","agafgdhaf",
            "ekopram@ee.its.ac.id","arif@ee.its.ac.id","aura1378@gmail.com",
            "djokosr@ee.its.ac.id","harris@ee.its.ac.id","jos@ee.its.ac.id"
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final ArrayList<HashMap<String, String>> list = new ArrayList<>();
        for (int i=0;i<namaDosen.length;i++){
            HashMap<String, String> data = new HashMap<>();
            data.put("namaDosen",namaDosen[i]);
            data.put("nip",nip[i]);
            list.add(data);
        }
        ArrayList<HashMap<String,Integer>> list1= new ArrayList<>();
        for (int i=0; i <namaDosen.length;i++){
            HashMap<String,Integer> data = new HashMap<>();
            data.put("foto",foto[i]);
            list1.add(data);
        }



        listview = (ListView)findViewById(R.id.list_item);
        customListViewAdapter = new CustomListViewAdapter(getApplicationContext(),list,list1);
        listview.setAdapter(customListViewAdapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int myPosition = position;
                String itemClickId = listview.getItemAtPosition(myPosition).toString();
                switch (itemClickId) {
                    case "0":

                        Intent satuIntent = new Intent(MainActivity.this, DetailActivity.class);
                        satuIntent.putExtra("foto",foto[0]);
                        satuIntent.putExtra("kode", "0") ;
                        satuIntent.putExtra("name", namaDosen[0]);
                        satuIntent.putExtra("nomor",nomorDosen[0]);
                        satuIntent.putExtra("email",email[0]);
                        startActivity(satuIntent);
                        break;
                    case "1":

                        Intent duaIntent = new Intent(MainActivity.this, DetailActivity.class);
                        duaIntent.putExtra("foto",foto[1]);
                        duaIntent.putExtra("kode", "1") ;
                        duaIntent.putExtra("name", namaDosen[1]);
                        duaIntent.putExtra("nomor",nomorDosen[1]);
                        duaIntent.putExtra("email",email[1]);
                        startActivity(duaIntent);
                        break;
                    case "2":
                        Intent tigaIntent = new Intent(MainActivity.this, DetailActivity.class);
                        tigaIntent.putExtra("foto",foto[2]);
                        tigaIntent.putExtra("kode", "2") ;
                        tigaIntent.putExtra("name",namaDosen[2]);
                        tigaIntent.putExtra("nomor",nomorDosen[2]);
                        tigaIntent.putExtra("email",email[2]);
                        startActivity(tigaIntent);
                        break;
                    case "3":
                        Intent empatIntent = new Intent(MainActivity.this, DetailActivity.class);
                        empatIntent.putExtra("foto",foto[3]);
                        empatIntent.putExtra("kode", "3") ;
                        empatIntent.putExtra("name", namaDosen[3]);
                        empatIntent.putExtra("nomor",nomorDosen[3]);
                        empatIntent.putExtra("email",email[3]);
                        startActivity(empatIntent);
                        break;
                    case "4":
                        Intent limaIntent = new Intent(MainActivity.this, DetailActivity.class);
                        limaIntent.putExtra("foto",foto[4]);
                        limaIntent.putExtra("kode", "4") ;
                        limaIntent.putExtra("name", namaDosen[4]);
                        limaIntent.putExtra("nomor",nomorDosen[4]);
                        limaIntent.putExtra("email",email[4]);
                        startActivity(limaIntent);
                        break;
                    case "5":
                        Intent enamIntent = new Intent(MainActivity.this, DetailActivity.class);
                        enamIntent.putExtra("foto",foto[5]);
                        enamIntent.putExtra("kode", "5") ;
                        enamIntent.putExtra("name", namaDosen[5]);
                        enamIntent.putExtra("nomor",nomorDosen[5]);
                        enamIntent.putExtra("email",email[5]);
                        startActivity(enamIntent);
                        break;
                    case "6":
                        Intent tujuhIntent = new Intent(MainActivity.this, DetailActivity.class);
                        tujuhIntent.putExtra("foto",foto[6]);
                        tujuhIntent.putExtra("kode", "6") ;
                        tujuhIntent.putExtra("name", namaDosen[6]);
                        tujuhIntent.putExtra("nomor",nomorDosen[6]);
                        tujuhIntent.putExtra("email",email[6]);
                        startActivity(tujuhIntent);
                        break;
                    case "7":
                        Intent delapanIntent = new Intent(MainActivity.this, DetailActivity.class);
                        delapanIntent.putExtra("foto",foto[7]);
                        delapanIntent.putExtra("kode", "7") ;
                        delapanIntent.putExtra("name", namaDosen[7]);
                        delapanIntent.putExtra("nomor",nomorDosen[7]);
                        delapanIntent.putExtra("email",email[7]);
                        startActivity(delapanIntent);
                        break;


                }



            }
        });






    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

