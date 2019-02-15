package com.example.estudiantes.miaplicacin;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActividadPrincipal extends AppCompatActivity {

    boolean mostrar=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_principal);
    }
    public void agregarFragmento(View v){
        FragmentManager miManejador=getSupportFragmentManager();
        FragmentTransaction miTransaccion=miManejador.beginTransaction();

        if(mostrar==false){
            Fragmento1 miFragmento=new Fragmento1();

            miTransaccion.add(R.id.contenedorFragmento,miFragmento);
            miTransaccion.commit();
            mostrar=true;
        }else{
            Fragmento2 miFragmento2=new Fragmento2();

            miTransaccion.add(R.id.contenedorFragmento,miFragmento2);
            miTransaccion.commit();
            mostrar=false;
        }
    }
}
