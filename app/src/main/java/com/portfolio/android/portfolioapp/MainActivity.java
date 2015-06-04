package com.portfolio.android.portfolioapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.spotifyStreamer).setOnClickListener(this);
        findViewById(R.id.buildItBigger).setOnClickListener(this);
        findViewById(R.id.XYZReader).setOnClickListener(this);
        findViewById(R.id.capstoneApp).setOnClickListener(this);
        findViewById(R.id.libraryApp).setOnClickListener(this);
        findViewById(R.id.scoresApp).setOnClickListener(this);
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

        switch (v.getId()) {
            case R.id.spotifyStreamer:
                Toast.makeText(this, getString(R.string.spofity_streamer), Toast.LENGTH_SHORT).show();
                break;

            case R.id.buildItBigger:
                Toast.makeText(this, getString(R.string.build_it_bigger), Toast.LENGTH_SHORT).show();
                break;

            case R.id.XYZReader:
                Toast.makeText(this, getString(R.string.xyz_reader), Toast.LENGTH_SHORT).show();
                break;

            case R.id.capstoneApp:
                Toast.makeText(this, getString(R.string.capstone_my_own_app), Toast.LENGTH_SHORT).show();
                break;

            case R.id.libraryApp:
                Toast.makeText(this, getString(R.string.library_app), Toast.LENGTH_SHORT).show();
                break;

            case R.id.scoresApp:
                Toast.makeText(this, getString(R.string.scores_app), Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
