package com.pdm.P_55_Creciente_Pref;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.pdm.P_20_Creciente_02.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button button= (Button)findViewById(R.id.button);
        button.setOnClickListener(this);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.llave:
                Toast.makeText(this, R.string.mensa_prepara,Toast.LENGTH_LONG).show();
                break;
            case R.id.info:
                Intent intent=new Intent(getApplicationContext(),SegundaActivity.class);
                startActivity(intent);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
    public void onClick(View view){
        if(view.getId()== R.id.button){
            Intent intent=new Intent(getApplicationContext(),SegundaActivity.class);
            startActivity(intent);
        }
    }
}
