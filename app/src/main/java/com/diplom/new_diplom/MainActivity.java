package com.diplom.new_diplom;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    private Button btn_run;
    private Button btn_settings;
    private Button btn_about;
    private Button btn_exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_run = (Button)  findViewById(R.id.btn_run);
        btn_settings = (Button)  findViewById(R.id.btn_settings);
        btn_about = (Button)  findViewById(R.id.btn_about);
        btn_exit = (Button)  findViewById(R.id.btn_exit);

        btn_run.setOnClickListener(this);
        btn_settings.setOnClickListener(this);
        btn_about.setOnClickListener(this);
        btn_exit.setOnClickListener(this);

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

    @Override
    public void onClick(View v) {
        TextView textView = (TextView) findViewById(R.id.textView);
        switch (v.getId()) {
            case R.id.btn_run:
                Intent intent = new Intent(MainActivity.this, RunActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_settings:
                Intent intent_settings = new Intent(MainActivity.this, RunActivity.class);
                startActivity(intent_settings);
                break;
            case R.id.btn_about:
                Intent intent_about = new Intent(MainActivity.this, RunActivity.class);
                startActivity(intent_about);
                break;
            case R.id.btn_exit:

                break;

        }

    }
}
