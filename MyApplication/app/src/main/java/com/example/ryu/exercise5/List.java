package com.example.ryu.exercise5;

/**
 * Created by RYU on 4.8.2016.
 */
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class List extends ListActivity {
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] values = new String[]{"Option 1", "Option 2", "Option 3",
                "Option 4", "Option 5", "Option 6", "Option 7", "Option 8",
                "Option 9", "Option 10", "Option 11", "Option 12", "Option 13",
                "Option 14"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.list, R.id.label, values);
        setListAdapter(adapter);
    }

        @Override
        protected void onListItemClick(ListView l, View v, int position, long id) {
            String item = (String) getListAdapter().getItem(position);
            Toast.makeText(this, item + " selected", Toast.LENGTH_LONG).show();
            }
}
