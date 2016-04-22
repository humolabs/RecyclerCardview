package com.humolabs.recyclercardview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class clsCategoriaAdapter extends RecyclerView.Adapter<clsCategoriaAdapter.clsCategoriaViewHolder>{
    private List<clsCategoria> item;

    //Constructor
    public clsCategoriaAdapter(List<clsCategoria> item) {
        this.item = item;
    }

    //Implemento los métodos abstractos
    //...ViewHolder se encarga de inflar la vista
    @Override
    public clsCategoriaViewHolder onCreateViewHolder(ViewGroup vwGroup, int viewType) {

        View vw = LayoutInflater.from(vwGroup.getContext()).inflate(R.layout.activity_categorias, vwGroup, false);

        clsCategoriaViewHolder categoria = new clsCategoriaViewHolder(vw);

        return categoria;
    }

    //onBindViewHolder se encarga de traer los datos
    @Override
    public void onBindViewHolder(clsCategoriaViewHolder holder, int i) {

        holder.categoria_equipo.setText(item.get(i).getDescripcionCategoria());

    }

    //getItemCount muestra el tamaño
    @Override
    public int getItemCount() {
        return item.size();
    }

    public class clsCategoriaViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView categoria_equipo;

        //Constructor
        public clsCategoriaViewHolder(View itemView) {
            super(itemView);

            categoria_equipo=(TextView) itemView.findViewById(R.id.txtCategoria);
        }

        //implemanto el método onClickListener
        @Override
        public void onClick(View view) {
            capturaClick.onItemClick(this, getAdapterPosition());
        }
    }


    //declaro la interfaz
    interface EscuchaEventosClick {
        void onItemClick(RecyclerView.ViewHolder holder, int posicion);
    }

    private EscuchaEventosClick capturaClick;
}
