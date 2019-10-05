package com.binweb.practicalistas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class VillanoAdapter extends RecyclerView.Adapter<VillanoAdapter.ViewHolderVillanos> {

    private List<Villano> listaDeVillanos;

    public VillanoAdapter(List<Villano> listaDeVillanos) {
        this.listaDeVillanos = listaDeVillanos;
    }

    @NonNull
    @Override
    public ViewHolderVillanos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View vistaDeLaCelda = layoutInflater.inflate(R.layout.celda_villano,parent,false);
        ViewHolderVillanos viewHolderVillanos = new ViewHolderVillanos(vistaDeLaCelda);
        return viewHolderVillanos;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderVillanos holder, int position) {
        Villano villanoAMostrar = listaDeVillanos.get(position);
        holder.cargarVillano(villanoAMostrar);
    }

    @Override
    public int getItemCount() {
        return listaDeVillanos.size();
    }

    public class ViewHolderVillanos extends RecyclerView.ViewHolder {

        private TextView textViewNombre;
        private TextView textViewPoder;
        private ImageView imageViewVillano;

        public ViewHolderVillanos(@NonNull View itemView) {
            super(itemView);

            textViewNombre = itemView.findViewById(R.id.textViewNombreVillano);
            textViewPoder = itemView.findViewById(R.id.textViewPoderVillano);
            imageViewVillano = itemView.findViewById(R.id.imageViewVillano);
        }

        public void cargarVillano(Villano villano){
            textViewNombre.setText(villano.getNombre());
            textViewPoder.setText(villano.getPoder());
            imageViewVillano.setImageResource(villano.getImagen());
        }


    }
}

