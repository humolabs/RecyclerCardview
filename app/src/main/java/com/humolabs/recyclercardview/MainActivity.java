package com.humolabs.recyclercardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.AdapterView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    private RecyclerView.LayoutManager lm;
    private RecyclerView.Adapter ad;
    private RecyclerView.Adapter adCat;

    private List<clsEquipo> equipos;
    //private List<clsCategoria> categorias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<clsEquipo> equipos = new ArrayList<clsEquipo>();

        equipos.add(new clsEquipo("Defensores de Belgrano","B Metropolitana",R.drawable.def_belgrano));
        equipos.add(new clsEquipo("Deportivo Morón","B Metropolitana",R.drawable.dep_moron));
        equipos.add(new clsEquipo("Estudiantes (BA)","B Metropolitana",R.drawable.est_ba));
        equipos.add(new clsEquipo("San Telmo","B Metropolitana",R.drawable.san_telmo));
        equipos.add(new clsEquipo("Talleres (RE)","B Metropolitana",R.drawable.talleres_re));


        List<clsCategoria> categorias = new ArrayList<clsCategoria>();

        categorias.add(new clsCategoria(1,"Primera A",equipos));
        categorias.add(new clsCategoria(2,"B Nacional",equipos));
        categorias.add(new clsCategoria(3,"B Metropolitana",equipos));
        categorias.add(new clsCategoria(4,"Primera C",equipos));
        categorias.add(new clsCategoria(5,"Primera D",equipos));
        categorias.add(new clsCategoria(6,"Torneo Federal A",equipos));
        categorias.add(new clsCategoria(7,"Torneo Federal B",equipos));


        rv = (RecyclerView)findViewById(R.id.rv);
        lm = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        rv.setLayoutManager(lm);
        ad = new clsEquipoAdapter((ArrayList<clsEquipo>) equipos);
        //ad = new clsEquipoAdapter(equipos);
        adCat = new clsCategoriaAdapter(categorias);

        //rv.setAdapter(ad);
        rv.setAdapter(adCat);


        }
    }
}
