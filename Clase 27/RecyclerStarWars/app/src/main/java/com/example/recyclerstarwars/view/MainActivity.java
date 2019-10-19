package com.example.recyclerstarwars.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.text.method.Touch;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.recyclerstarwars.R;
import com.example.recyclerstarwars.controller.PeliculaController;
import com.example.recyclerstarwars.model.Pelicula;
import com.example.recyclerstarwars.utils.ResultListener;

import static com.example.recyclerstarwars.view.FragmentDetallePelicula.CLAVE_PELICULA;

public class MainActivity extends AppCompatActivity implements FragmentListaPeliculas.ListenerDeFragment {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pegaFragment(new FragmentListaPeliculas());
    }

    private void pegaFragment(Fragment fragment){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.mainActivity_container,fragment)
                .addToBackStack(null)
                .commit();
    }


    @Override
    public void recibirPelicula(final Pelicula pelicula) {
        //aca voy a cargar el fragmetn con el detalle de la pelicula
        Toast.makeText(this, pelicula.getTitulo(), Toast.LENGTH_SHORT).show();
        FragmentDetallePelicula fragmentDetallePelicula = new FragmentDetallePelicula();
        Bundle bundle = new Bundle();
        bundle.putSerializable(FragmentDetallePelicula.CLAVE_PELICULA,pelicula);
        fragmentDetallePelicula.setArguments(bundle);
        pegaFragment(fragmentDetallePelicula);

        PeliculaController controller= new PeliculaController();

        controller.traerPelicula(3, new ResultListener<Pelicula>() {
            @Override
            public void finish(Pelicula result) {
                Toast.makeText(MainActivity.this,pelicula.getTitulo(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
