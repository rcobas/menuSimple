package com.example.menusimple;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.itemperro:
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.anipedia.net/perros/"));
                startActivity(i);

                return true;
            case R.id.itemGato1:

                i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikipedia.org/wiki/Comida_para_gatos"));
                startActivity(i);
                return true;
            case R.id.itemGato2:
                i = new Intent("android.intent.action.VIEW", Uri.parse("https://www.tiendanimal.es/articulos/vacunas-para-gatos-cuales-y-cuando-ponerlas"));
                startActivity(i);
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }

    }
}