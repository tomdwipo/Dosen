package com.androbos.dosen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private ListView listview;
    private CustomListViewAdapter customListViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String[] namaDosen = new String[]{
                "Eko Setijadi, ST., MT., Ph.D","Ir. Hany Boedinugroho, MT."
        };
        final String[] nip = new String[]{
                "197210012003121002","196107061987011001"
        };
        final Integer[] foto = new Integer[]{
                R.drawable.ekoset,R.drawable.hani
        };
        ArrayList<HashMap<String, String>> list = new ArrayList<>();
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
                switch (itemClickId){
                    case "0":
                        Toast.makeText(getApplicationContext(),"zero",Toast.LENGTH_SHORT).show();
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

