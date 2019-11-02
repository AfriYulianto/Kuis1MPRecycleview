package com.example.kuis1mprecycleview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private KeluargaAdapter adapter;
    private ArrayList<Keluarga> mahasiswaArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView)findViewById(R.id.recyclerview_1);

        adapter = new KeluargaAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

    }

    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Keluarga("Kusno", "Bapak","08 Oktober 1973" , R.drawable.afri));
        mahasiswaArrayList.add(new Keluarga("Sutarmi", "Ibu", "20 Februari 1973" , R.drawable.afri));
        mahasiswaArrayList.add(new Keluarga("Afri Dwi Yulianto", "Anak Pertama", "19 Juli 1998" , R.drawable.afri));
        mahasiswaArrayList.add(new Keluarga("Dita Amalia Ramadhani", "Anak Kedua", "10 Oktober 2005" , R.drawable.afri));
    }
}


