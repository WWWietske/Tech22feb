package com.example.user.tech22feb;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Als je op een symbool klikt dan geeft ie een toast met de naam.
 */
public class MyOwnRowAdepter extends ArrayAdapter<String>{

    Context context1;
    int[] pictures1;
    String[] names1;

    // zeggen dat die waardes zo doorgegeven zijn
    public MyOwnRowAdepter(Context context, int[] pictures, String[] names){
        super(context, R.layout.single_row_layout, names);

        context1 = context;
        pictures1 = pictures;
        names1 = names;
    }

    public View getView(int position, View view, ViewGroup parent){
        // view als er nog geen view is
        if (view == null){
            // context meegeven
            LayoutInflater inflater = (LayoutInflater) context1.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.single_row_layout, parent, false);
        }

        // kan je nu de images en tekst die je mee kreeg in deze view stoppen
        ImageView imageview = (ImageView) view.findViewById(R.id.shapeImageView);
        TextView textview = (TextView) view.findViewById(R.id.nameTextView);

        final String name = names1[position];
        int picture = pictures1[position];

        textview.setText(name);
        imageview.setImageResource(picture);

        View.OnClickListener listener1 = new View. OnClickListener(){
            @Override
            public void onClick(View v) {
                String text = "You clicked on " + name;
                // toast is klein grijs berichtje
                Toast toast = Toast.makeText(context1, text, Toast.LENGTH_SHORT);
                toast.show();
            }
        };

        // onclicklistener meegeven aan de view
        view.setOnClickListener(listener1);

        return view;
    }
}
