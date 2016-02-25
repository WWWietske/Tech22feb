package com.example.user.tech22feb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

public class SelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
        int[] pictures = new int[]{R.drawable.square, R.drawable.rectangle, R.drawable.oval, R.drawable.circle};
        String[] names = new String[]{"square", "rectangle", "oval", "circle"};

        ListView listview1 = (ListView) findViewById(R.id.listviewShapes);

        // aanmaken adapter
        MyOwnRowAdepter myadapter = new MyOwnRowAdepter(this, pictures, names);

        // koppelen listview aan adapter
        // android wil dat het zo gaat --> listview1.setAdapter((ListAdapter) myadapter);
        listview1.setAdapter(myadapter);
    }
}
