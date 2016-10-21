package com.example.ryu.exercise6;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int option = item.getItemId();
        switch (option)
        {
            case R.id.option1:

                Intent intent = new Intent();
                intent.setClass(getBaseContext(), Activity2.class);
                Toast.makeText(this,R.string.op1,Toast.LENGTH_LONG).show();
                startActivity(intent);
                break;

            case R.id.option2:

                Intent intent2 = new Intent();
                intent2.setClass(getBaseContext(), Activity3.class);
                startActivity(intent2);
                Toast.makeText(this,R.string.op2,Toast.LENGTH_LONG).show();
                break;
        }
        return false;
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {

            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setTitle(R.string.titleDialog);
            alert.setMessage(R.string.messageDialog);
            alert.setPositiveButton(R.string.ok, new
                    DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int whichButton) {
                            finish();
                        }
                    });
            alert.setNegativeButton(R.string.cancel, new
                    DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int whichButton) {
                        }
                    });
            alert.show();

        }
        return false;
    }

}
