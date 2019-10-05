package com.binweb.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class VillanoAdpater extends RecyclerView.Adapter<VillanoAdpater.ViewHolderVillanos>{

    private List<Villano> listaDeVillanos;

    public VillanoAdpater(List<Villano> listaDeVillanos) {
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
        private TextView textViewSuperpoder;

        public ViewHolderVillanos(@NonNull View itemView) {
            super(itemView);

            textViewNombre = itemView.findViewById(R.id.celdaVillano_nombre);
            textViewSuperpoder = itemView.findViewById(R.id.celdaVillano_superPoder);
        }

        public void cargarVillano(Villano villano){
            textViewNombre.setText(villano.getNombre());
            textViewSuperpoder.setText(villano.getSuperPoder());

        }
    }
}
