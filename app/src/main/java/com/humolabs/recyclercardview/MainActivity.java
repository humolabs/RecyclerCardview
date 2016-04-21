package com.humolabs.recyclercardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    private RecyclerView.LayoutManager lm;
    private RecyclerView.Adapter ad;

    private ArrayList<clsEquipo> equipos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<clsEquipo> equipos = new ArrayList<clsEquipo>();

        equipos.add(new clsEquipo("Defensores de Belgrano","B Metropolitana",R.drawable.def_belgrano));
        equipos.add(new clsEquipo("Deportivo Morón","B Metropolitana",R.drawable.dep_moron));
        equipos.add(new clsEquipo("Estudiantes (BA)","B Metropolitana",R.drawable.est_ba));
        equipos.add(new clsEquipo("San Telmo","B Metropolitana",R.drawable.san_telmo));
        equipos.add(new clsEquipo("Talleres (RE)","B Metropolitana",R.drawable.talleres_re));

        rv = (RecyclerView)findViewById(R.id.rv);
        lm = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        rv.setLayoutManager(lm);
        ad = new clsEquipoAdapter(equipos);
        rv.setAdapter(ad);

    }
}
