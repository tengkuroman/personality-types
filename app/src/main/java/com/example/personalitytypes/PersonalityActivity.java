package com.example.personalitytypes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

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
                viewPersonalityDetail(personality);
            }
        });
    }

    private void viewPersonalityDetail(Personality personality) {
        Intent moveToPersonalityDetail = new Intent(PersonalityActivity.this, PersonalityDetailActivity.class);
        moveToPersonalityDetail.putExtra(PersonalityDetailActivity.EXTRA_PERSONALITY_NAME, personality.getPersonalityName());
        moveToPersonalityDetail.putExtra(PersonalityDetailActivity.EXTRA_DETAIL_PERSONALITY_DESCRIPTION, personality.getDetailDescription());
        moveToPersonalityDetail.putExtra(PersonalityDetailActivity.EXTRA_DETAIL_PERSONALITY_PHOTO, personality.getDetailPhoto());
        startActivity(moveToPersonalityDetail);
    }
}
