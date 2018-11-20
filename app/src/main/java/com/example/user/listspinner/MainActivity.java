package com.example.user.listspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView mob;
    Spinner spins;


    // String[] mobileArray;// = {"Samsung", "HTC", "Redmi", "Moto", "Microsoft", "IPhone"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spins=(Spinner)findViewById(R.id.spin);
        mob = (ListView) findViewById(R.id.list);
        ArrayList<String> mobiles = new ArrayList<>();
        ArrayAdapter<String> adapt = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,mobiles);
        // mobiles.addAll(Arrays.asList(mobileArray));
        spins.setAdapter(adapt);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mobiles);
        mobiles.add("Samsung");
        mobiles.add("HTC");
        mobiles.add("IPhone");
        mobiles.add("Redmi");
        mobiles.add("Moto");
        mobiles.add("Microsoft");
        mob.setAdapter(adapter);
        mob.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String itemValue = (String) mob.getItemAtPosition(position);
                if (itemValue == "Samsung") {

                    Toast.makeText(MainActivity.this, "you selected Samsung", Toast.LENGTH_SHORT).show();


                } else if (itemValue == "HTC") {

                    Toast.makeText(MainActivity.this, "you selected HTC", Toast.LENGTH_SHORT).show();

                } else if (itemValue == "IPhone") {

                    Toast.makeText(MainActivity.this, "you selected IPhone", Toast.LENGTH_SHORT).show();
                } else if (itemValue == "Redmi") {

                    Toast.makeText(MainActivity.this, "you selected Redmi", Toast.LENGTH_SHORT).show();
                } else if (itemValue == "Moto") {

                    Toast.makeText(MainActivity.this, "you selected Moto", Toast.LENGTH_SHORT).show();
                } else {

                    Toast.makeText(MainActivity.this, "you selected Microsoft", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }}



