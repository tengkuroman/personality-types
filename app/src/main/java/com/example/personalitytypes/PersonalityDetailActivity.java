package com.example.personalitytypes;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PersonalityDetailActivity extends AppCompatActivity {
    public static final String EXTRA_PERSONALITY_NAME = "extra_personality_name";
    public static final String EXTRA_DETAIL_PERSONALITY_DESCRIPTION = "extra_detail_personality_description";
    public static final String EXTRA_DETAIL_PERSONALITY_PHOTO = "extra_detail_personality_photo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality_detail);

        TextView tvDetailPersonalityName = findViewById(R.id.tv_detail_personality_name);
        TextView tvDetailDescription = findViewById(R.id.tv_detail_personality_description);
        ImageView imgDetailPersonality = findViewById(R.id.img_detail_personality_image);

        String personalityName = getIntent().getStringExtra(EXTRA_PERSONALITY_NAME);
        String detailDescription = getIntent().getStringExtra(EXTRA_DETAIL_PERSONALITY_DESCRIPTION);
        int detailPhoto = getIntent().getIntExtra(EXTRA_DETAIL_PERSONALITY_PHOTO, 0);

        tvDetailPersonalityName.setText(personalityName);
        tvDetailDescription.setText(detailDescription);
        imgDetailPersonality.setImageDrawable(getResources().getDrawable(detailPhoto));
    }
}
