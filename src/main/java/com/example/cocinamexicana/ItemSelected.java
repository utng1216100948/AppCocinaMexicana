package com.example.cocinamexicana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ItemSelected extends AppCompatActivity {

    private ListView listSelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_selected);
        //Relacionar xml con clase JAVA
        listSelected = (ListView) findViewById(R.id.lsv_itemSelected);

        //Array para cargar ListView
        ArrayList<String> platilloSeleccionado = new ArrayList<>();
        platilloSeleccionado.add("Pozole");
        platilloSeleccionado.add("Tacos");
        platilloSeleccionado.add("Mole Amarillo");
        platilloSeleccionado.add("Tamales");
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,platilloSeleccionado);
        listSelected.setAdapter(adapter);

        //Evento OnClick
        listSelected.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ItemSelected.this, Details.class);
                startActivity(intent);
            }
        });
    }
}/*End*/