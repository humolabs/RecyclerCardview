package com.humolabs.recyclercardview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class clsEquipoAdapter extends RecyclerView.Adapter<clsEquipoAdapter.clsEquipoViewHolder>{
    private ArrayList<clsEquipo> item;

    //Constructor
    public clsEquipoAdapter(ArrayList<clsEquipo> item) {
        this.item = item;
    }

    //Implemento los métodos abstractos
    //...ViewHolder se encarga de inflar la vista
    @Override
    public clsEquipoViewHolder onCreateViewHolder(ViewGroup vwGroup, int viewType) {

        View vw = LayoutInflater.from(vwGroup.getContext()).inflate(R.layout.activity_equipos, vwGroup, false);

        clsEquipoViewHolder equipo = new clsEquipoViewHolder(vw);

        return equipo;
    }

    //onBindViewHolder se encarga de traer los datos
    @Override
    public void onBindViewHolder(clsEquipoViewHolder holder, int i) {

        holder.nombre_equipo.setText(item.get(i).getNombre_equipo());
        holder.categoria_equipo.setText(item.get(i).getCategoria_equipo());
        holder.escudo_equipo.setImageResource(item.get(i).getEscudo_equipo());

    }

    //getItemCount muestra el tamaño
    @Override
    public int getItemCount() {
        return item.size();
    }

    public class clsEquipoViewHolder extends RecyclerView.ViewHolder{

        TextView nombre_equipo;
        TextView categoria_equipo;
        ImageView escudo_equipo;

        //Constructor
        public clsEquipoViewHolder(View itemView) {
            super(itemView);

            nombre_equipo=(TextView) itemView.findViewById(R.id.txtNombreEquipo);
            categoria_equipo=(TextView) itemView.findViewById(R.id.txtCategoriaEquipo);
            escudo_equipo=(ImageView) itemView.findViewById(R.id.imgEscudo);
        }
    }

}
