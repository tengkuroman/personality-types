package com.example.personalitytypes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class PersonalityActivity extends AppCompatActivity {
    private RecyclerView rvPersonalities;
    private ArrayList<Personality> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality);

        rvPersonalities = findViewById(R.id.rv_personality);
        rvPersonalities.setHasFixedSize(true);

        list.addAll(PersonalitiesData.getListData());
        showRecyclerList();

    }

    private void showRecyclerList() {
        rvPersonalities.setLayoutManager(new LinearLayoutManager(this));
        ListPersonalityAdapter listPersonalityAdapter = new ListPersonalityAdapter(list);
        rvPersonalities.setAdapter(listPersonalityAdapter);

        listPersonalityAdapter.setOnItemClickCallback(new ListPersonalityAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Personality personality) {
                showSelectedHero(personality);
            }
        });
    }

    private void showSelectedHero(Personality personality) {
        Toast.makeText(this, "Kamu memilih " + personality.getPersonalityName(), Toast.LENGTH_SHORT).show();
    }
}
