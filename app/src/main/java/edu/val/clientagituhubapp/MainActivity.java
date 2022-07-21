package edu.val.clientagituhubapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new ObtenerDatos(this).execute();
        new ObtenerDatosDe1Alumno (this).execute(18);
    }

    public void mostrarResultados (List<Alumno> listaAlumnos)
    {
        Log.d("ETIQUETA_LOG", "Alumnos rx = " + listaAlumnos);


    }

    public void mostrarResultado1Alumno (Alumno alumno)
    {
        Log.d("ETIQUETA_LOG", "Alumno rx = " + alumno);


    }
}