package com.example.personalitytypes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PersonalityDetailActivity extends AppCompatActivity {
    public static final String EXTRA_PERSONALITY_NAME = "extra_personality_name";
    public static final String EXTRA_DETAIL_PERSONALITY_DESCRIPTION = "extra_detail_personality_description";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality_detail);

        TextView tvDetailPersonalityName = findViewById(R.id.tv_detail_personality_name);
        TextView tvDetailDescription = findViewById(R.id.tv_detail_personality_description);

        String personalityName = getIntent().getStringExtra(EXTRA_PERSONALITY_NAME);
        String detailDescription = getIntent().getStringExtra(EXTRA_DETAIL_PERSONALITY_DESCRIPTION);

        tvDetailPersonalityName.setText(personalityName);
        tvDetailDescription.setText(detailDescription);
    }
}
