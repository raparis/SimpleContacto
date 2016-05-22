package com.rapariscode.petgram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView listadoMascotas;
    ArrayList<Mascota> mascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.miBarraAccion);
        setSupportActionBar(myToolbar);

        mascotas = new ArrayList<Mascota>();
        mascotas.add( new Mascota("Jacky", R.drawable.mascota01, 3));
        mascotas.add( new Mascota("Duquesa", R.drawable.mascota02, 2));
        mascotas.add( new Mascota("Kiddo", R.drawable.mascota03, 5));
        mascotas.add( new Mascota("Snoopy", R.drawable.mascota04, 4 ));
        mascotas.add( new Mascota("TopCat", R.drawable.mascota05, 1 ));
        mascotas.add( new Mascota("Pastor", R.drawable.mascota06, 3 ));
        mascotas.add( new Mascota("Killer", R.drawable.mascota07, 3 ));
        mascotas.add( new Mascota("Juancho", R.drawable.mascota08, 4 ));

        listadoMascotas = (RecyclerView) findViewById( R.id.recyclerViewMascotas );
        LinearLayoutManager llm = new LinearLayoutManager( this );
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listadoMascotas.setLayoutManager( llm );

        MascotaAdaptador adaptador = new MascotaAdaptador( mascotas );
        listadoMascotas.setAdapter( adaptador );
    }

    public void addStar( View v ) {
        Toast.makeText( this, R.string.mensaje_add_stars, Toast.LENGTH_LONG).show();
    }

    public void irFavoritosActivity ( View v ) {
        Intent intent = new Intent( this, ActivityFavoritos.class );
        startActivity( intent );

    }
}
