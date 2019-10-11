package com.example.recyclerstarwars.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerstarwars.R;
import com.example.recyclerstarwars.model.Pelicula;

import java.util.ArrayList;
import java.util.List;

public class AdapterPeliculas extends RecyclerView.Adapter <AdapterPeliculas.ViewHolderPeliculas>{

    private List<Pelicula> peliculaList;
    private ListenerDelAdapter listenerDelAdapter;

    public AdapterPeliculas(List<Pelicula> peliculaList) {
        this.peliculaList = peliculaList;
    }
    public AdapterPeliculas(ListenerDelAdapter listenerDelAdapter){
        peliculaList = new ArrayList<>();
        this.listenerDelAdapter = listenerDelAdapter;
    }

    @NonNull
    @Override
    public ViewHolderPeliculas onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View vistaDeLaCelda = layoutInflater.inflate(R.layout.celda_pelicula,parent,false);
        return new ViewHolderPeliculas(vistaDeLaCelda);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderPeliculas holder, int position) {
        Pelicula peliculaMostrada = peliculaList.get(position);
        holder.cargarPelicula(peliculaMostrada);
    }





    @Override
    public int getItemCount() {
        return peliculaList.size();
    }

    public void setPeliculaList(List<Pelicula> peliculaList) {
        this.peliculaList = peliculaList;
        notifyDataSetChanged();
    }

    public class ViewHolderPeliculas extends RecyclerView.ViewHolder{
        private TextView textViewTitulo;
        private TextView textViewDirector;
        private TextView textViewFecha;

        public ViewHolderPeliculas(@NonNull View itemView){
            super(itemView);
            textViewTitulo = itemView.findViewById(R.id.celdaPelicula_titulo);
            textViewDirector = itemView.findViewById(R.id.celdaPelicula_director);
            textViewFecha = itemView.findViewById(R.id.celdaPelicula_fecha);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Pelicula peliculaSeleccionada = peliculaList.get(getAdapterPosition());
                    listenerDelAdapter.informarPeliculaSeleccionada(peliculaSeleccionada);
                }
            });
        }

        public void cargarPelicula(Pelicula pelicula){

            textViewTitulo.setText(pelicula.getTitulo());
            textViewFecha.setText(pelicula.getFechaEstreno());
            textViewDirector.setText(pelicula.getDirector());
        }
    }

    public interface ListenerDelAdapter{
        public void informarPeliculaSeleccionada(Pelicula pelicula);
    }
}
