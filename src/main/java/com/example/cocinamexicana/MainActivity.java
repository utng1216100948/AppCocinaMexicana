package com.example.cocinamexicana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Relacionar archivo xml con clase JAVA
        listView = (ListView) findViewById(R.id.lsv_main);

        //Array para cargr ListView
        ArrayList<String> listaPlatillos = new ArrayList<>();
        listaPlatillos.add("Carnes");
        listaPlatillos.add("Sopas");
        listaPlatillos.add("Moles");
        listaPlatillos.add("Postres");
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, listaPlatillos);
        listView.setAdapter(adapter);

        //Evento OnClick
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, ItemSelected.class);
                startActivity(intent);
            }
        });
    }
}/*End*/