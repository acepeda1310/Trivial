package com.example.adrian.trivial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements ListView.OnItemClickListener{
    ListView listViewCiudades;
    TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewCiudades=(ListView)findViewById(R.id.listView);
        textViewResultado=(TextView)findViewById(R.id.textView2);

        String[] ciudades={"MADRID","BARCELONA","CUENCA"};

        ArrayAdapter<String> adaptador=new ArrayAdapter<String>(this,R.layout.fila,ciudades);

        listViewCiudades.setAdapter(adaptador);
        listViewCiudades.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(position==0){
            textViewResultado.setText(R.string.acierto);
        } else{
            textViewResultado.setText(R.string.fallo);
        }
    }
}
