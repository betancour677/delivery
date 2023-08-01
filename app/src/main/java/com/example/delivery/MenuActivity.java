package com.example.delivery;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.delivery.databinding.ActivityMenuBinding;


public class MenuActivity extends AppCompatActivity {

    private ActivityMenuBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMenuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Clic en la imagen de Pizza
        binding.layoutPizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityWithMap(R.drawable.pizza);
            }
        });

        // Clic en la imagen de Hamburguesa
        binding.layoutHamburguesa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityWithMap(R.drawable.burguer);
            }
        });

        // Clic en la imagen de Sushi
        binding.layoutSushi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityWithMap(R.drawable.sushi);
            }
        });
    }

    private void startActivityWithMap(int imageResId) {
        Intent intent = new Intent(MenuActivity.this, MapActivity.class);
        intent.putExtra("imageResId", imageResId);
        startActivity(intent);
    }
}
